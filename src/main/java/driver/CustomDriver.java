package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.Configurations;

import java.io.IOException;

public class CustomDriver {

    public static WebDriver driver = null;

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
        options.setBrowserVersion("108.0.1");
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox");
        return options;
    }

    private static EdgeOptions setEdgeOptions() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        return options;
    }

    public static void setDriver(WebDriver driver) {
        CustomDriver.driver = driver;
    }

    public static WebDriver getDriver()  {

        if (Configurations.getPropValues("browser_type").equals("chrome")) {
            if (driver == null) {
                driver = new ChromeDriver(setChromeOptions());
            }

        } else if (Configurations.getPropValues("browser_type").equals("firefox")) {
            if (driver == null) {
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver(setFirefoxOptions());
                driver.manage().window().maximize();
            }
        }
        else if (Configurations.getPropValues("browser_type").equals("edge")) {
            if (driver == null) {
                driver = new EdgeDriver(setEdgeOptions());
            }
        }
        return driver;
    }

}
