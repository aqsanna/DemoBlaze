package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage extends DriverManager {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public Boolean isDisplayed(){
        DriverManager.getDriver();
        Boolean displayLogout = driver.findElement(By.id("contcar")).isDisplayed();
        return displayLogout;
    }
    public void pageClose(){
       driver.quit();
    }
}
