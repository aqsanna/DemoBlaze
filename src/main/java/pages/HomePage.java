package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {
    WebDriver driver;
    String url="https://www.demoblaze.com/index.html";

   public  HomePage(WebDriver driver){
       this.driver=driver;
   }
    public static ChromeOptions setOptions(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }

    public Boolean isDisplayed(){
        driver = new ChromeDriver(setOptions());
        driver.get(url);
        Boolean displayLogout = driver.findElement(By.id("contcar")).isDisplayed();
        return displayLogout;
    }
    public void pageClose(){
       driver.quit();
    }
}
