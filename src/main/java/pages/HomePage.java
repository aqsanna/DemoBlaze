package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage  {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    public Boolean isDisplayed(){
        Boolean displayLogout = driver.findElement(By.id("contcar")).isDisplayed();
        return displayLogout;
    }
}
