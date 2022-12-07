package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AboutUsPage  {

    WebDriver driver;
    public AboutUsPage(WebDriver driver) {
        this.driver=driver;
    }

    public void openAboutUs() throws InterruptedException {
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
}
