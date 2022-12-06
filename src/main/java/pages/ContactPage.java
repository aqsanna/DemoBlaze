package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContactPage extends DriverManager {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void openContact() throws InterruptedException {
        DriverManager.getDriver();
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
