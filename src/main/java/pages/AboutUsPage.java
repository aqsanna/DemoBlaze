package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AboutUsPage extends DriverManager {

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public void openAboutUs() throws InterruptedException {
        DriverManager.getDriver();
        WebElement aboutUs = driver.findElement(By.linkText("About us"));
        aboutUs.click();
        Thread.sleep(1000);
        WebElement playButton = driver.findElement(By.className("vjs-big-play-button"));
        playButton.click();
        Thread.sleep(1000);
    }
    public Boolean isDisplayed(){
        Boolean videoButton = driver.findElement(By.className("vjs-big-play-button")).isEnabled();
        return  videoButton;
    }
    public void pageClose(){
        driver.quit();
    }
}
