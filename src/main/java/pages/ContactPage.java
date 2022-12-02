package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContactPage {
    WebDriver driver;
    String url= "https://www.demoblaze.com/index.html";

    public  ContactPage(WebDriver driver){
        this.driver=driver;
    }
    public static ChromeOptions setOptions(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }
    public void openContact() throws InterruptedException {
        driver = new ChromeDriver(setOptions());
        driver.get(url);
        WebElement aboutUs = driver.findElement(By.linkText("Contact"));
        aboutUs.click();
        Thread.sleep(1000);
        WebElement signInButton = driver.findElement(By.cssSelector("[onclick='send()']"));
        signInButton.click();
        Thread.sleep(3000);
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void pageClose(){
        driver.quit();
    }
}
