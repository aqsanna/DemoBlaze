package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignInPage extends DriverManager {


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void signInSuccess() throws InterruptedException {
        DriverManager.getDriver();
        WebElement signIn = driver.findElement(By.id("login2"));
        signIn.click();
        Thread.sleep(1000);
        WebElement userName = driver.findElement(By.id("loginusername"));
        userName.sendKeys("Oqsannatest");
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("test123");
        WebElement signInButton = driver.findElement(By.cssSelector("[onclick='logIn()']"));
        signInButton.click();
        Thread.sleep(3000);
    }

    public void signInEmpty() throws InterruptedException {
        DriverManager.getDriver();
        WebElement signIn = driver.findElement(By.id("login2"));
        signIn.click();
        Thread.sleep(1000);
        WebElement signInButton = driver.findElement(By.cssSelector("[onclick='logIn()']"));
        signInButton.click();
        Thread.sleep(3000);
    }

    public void NonExistingUser() throws InterruptedException {
        DriverManager.getDriver();
        WebElement signIn = driver.findElement(By.id("login2"));
        signIn.click();
        Thread.sleep(1000);
        WebElement userName = driver.findElement(By.id("loginusername"));
        userName.sendKeys("asdadasdaa");
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("test123");
        WebElement signInButton = driver.findElement(By.cssSelector("[onclick='logIn()']"));
        signInButton.click();
        Thread.sleep(2000);

    }

    public Boolean isDisplayed(){

        Boolean displayLogout = driver.findElement(By.id("logout2")).isDisplayed();
        return displayLogout;
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void pageClose(){
        driver.quit();
    }

}
