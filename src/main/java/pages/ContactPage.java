package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContactPage  {
    WebDriver driver;

    public ContactPage(WebDriver driver) {
       this.driver=driver;
    }

    public void openContact() throws InterruptedException {
        WebElement aboutUs = driver.findElement(By.linkText("Contact"));
        aboutUs.click();
        Thread.sleep(1000);
        WebElement signInButton = driver.findElement(By.cssSelector("[onclick='send()']"));
        signInButton.click();
        Thread.sleep(3000);
    }
}
