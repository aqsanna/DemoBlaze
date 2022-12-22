package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.Configurations;

import java.io.IOException;

public class DriverManager {

   public static WebDriver driver=null;

    private static ChromeOptions setChromeOptions() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }
    private static FirefoxOptions setFirefoxOptions() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");
        return options;
    }

    public static  void setDriver(WebDriver driver){
        DriverManager.driver=driver;
    }

    public static WebDriver getDriver() throws IOException {

        if(Configurations.getPropValues("browser_type").equals("chrome")){
            if(driver==null){
                driver = new ChromeDriver(setChromeOptions());
            }
            return driver;
        }
        else if(Configurations.getPropValues("browser_type").equals("firefox")) {
            if (driver == null) {
                driver = new FirefoxDriver(setFirefoxOptions());
            }
            return driver;
        }
        return driver;
    }

}
