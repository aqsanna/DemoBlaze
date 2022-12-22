package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class Configurations {

    public static final String URL;
    public static final String BROWSER;
    public static final String TESTNG_XML;

    static {
        try {
            URL = getPropValues("url");
            BROWSER = getPropValues("browser");
            TESTNG_XML = getPropValues("testng_xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static InputStream inputStream;

    public static Properties getPropValues() throws IOException {
        String result = "";
        Properties prop = new Properties();
        try {
            String propFileName = "config.properties";
            inputStream = Configurations.class.getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                prop = null;
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return prop;
    }

    public static String getPropValues(String key) throws IOException {

        if (System.getProperty(key) == null) {
            return getPropValues().getProperty(key);
        }
        return System.getProperty(key);
    }

}
