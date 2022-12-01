package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignInPage {
    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";

    public SignInPage(WebDriver driver){
        this.driver=driver;
    }
    private static ChromeOptions setOptions(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximazed");
        return options;
    }

    public void signInSuccess() throws InterruptedException {
        driver = new ChromeDriver(setOptions());
        driver.get(url);
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
        driver = new ChromeDriver(setOptions());
        driver.get(url);
        WebElement signIn = driver.findElement(By.id("login2"));
        signIn.click();
        Thread.sleep(1000);
        WebElement signInButton = driver.findElement(By.cssSelector("[onclick='logIn()']"));
        signInButton.click();
        Thread.sleep(3000);
    }

    public void NonExistingUser() throws InterruptedException {
        driver = new ChromeDriver(setOptions());
        driver.get(url);
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

    public void PageClose(){
        driver.quit();
    }

}
