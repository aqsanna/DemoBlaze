package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

   public static WebDriver driver=null;

    private static ChromeOptions setChromeOptions() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }

    public static  void setDriver(WebDriver driver){
        DriverManager.driver=driver;
    }

    public static WebDriver getDriver(){

        if(driver==null){
            driver = new ChromeDriver(setChromeOptions());
        }
        return driver;
    }



}
