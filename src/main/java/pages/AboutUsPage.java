package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AboutUsPage {
    WebDriver driver;
    String url= "https://www.demoblaze.com/index.html";

    public AboutUsPage(WebDriver driver){
        this.driver=driver;
    }
    public static ChromeOptions setOptions(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }
    public void openAboutUs() throws InterruptedException {
        driver = new ChromeDriver(setOptions());
        driver.get(url);
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
