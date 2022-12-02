package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignUpPage {
    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private static ChromeOptions setOptions() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }


    public void signUpSuccess() throws InterruptedException {
        driver = new ChromeDriver(setOptions());
        driver.get(url);
        WebElement signUp = driver.findElement(By.id("signin2"));
        signUp.click();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("sign-username"));
        userName.sendKeys("Oqsannatest01122022");
        WebElement userPass = driver.findElement(By.id("sign-password"));
        userPass.sendKeys("test123");
        WebElement signUpButton = driver.findElement(By.cssSelector("[onclick='register()']"));
        signUpButton.click();
        Thread.sleep(2000);
    }

    public void signUpEmpty() throws InterruptedException {
        driver = new ChromeDriver(setOptions());
        driver.get(url);
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

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void pageClose(){
        driver.quit();
    }


}
