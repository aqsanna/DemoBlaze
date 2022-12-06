package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DriverManager {

   public static WebDriver driver;

   public DriverManager (WebDriver driver){
       this.driver=driver;
    }

    private static ChromeOptions setOptions() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }

    @BeforeTest
    public static WebDriver getDriver(){
        driver = new ChromeDriver(setOptions());
        driver.get("https://www.demoblaze.com/index.html");
        return driver;
    }

    @AfterTest
    public void pageClose(){
        driver.quit();
    }
}