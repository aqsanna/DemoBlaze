package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignUpPage extends DriverManager {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    public void signUpSuccess() throws InterruptedException {
        DriverManager.getDriver();
        WebElement signUp = driver.findElement(By.id("signin2"));
        signUp.click();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("sign-username"));
        userName.sendKeys("Oqsannatest00712202222");
        WebElement userPass = driver.findElement(By.id("sign-password"));
        userPass.sendKeys("test123");
        WebElement signUpButton = driver.findElement(By.cssSelector("[onclick='register()']"));
        signUpButton.click();
        Thread.sleep(2000);
    }

    public void signUpEmpty() throws InterruptedException {
        DriverManager.getDriver();
        WebElement signUp = driver.findElement(By.id("signin2"));
        signUp.click();
        Thread.sleep(2000);
        WebElement signUpButton = driver.findElement(By.cssSelector("[onclick='register()']"));
        signUpButton.click();
        Thread.sleep(2000);
    }

    public void signUpExistingInfo() throws InterruptedException {
        signUpSuccess();
    }
}
