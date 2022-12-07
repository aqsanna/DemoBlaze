package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage  {

    WebDriver driver;
    private WebElement signIn;
    private WebElement userName;
    private WebElement password;
    private WebElement signInButton;
    private  WebElement logout;

    public SignInPage(WebDriver driver) {
        this.driver=driver;
        signIn = driver.findElement(By.id("login2"));
        userName = driver.findElement(By.id("loginusername"));
        password = driver.findElement(By.id("loginpassword"));
        signInButton = driver.findElement(By.cssSelector("[onclick='logIn()']"));
        logout = driver.findElement(By.id("logout2"));
    }

    public void signInSuccess() throws InterruptedException {
        signIn.click();
        Thread.sleep(1000);
        userName.sendKeys("Oqsannatest");
        password.sendKeys("test123");
        signInButton.click();
        Thread.sleep(3000);
    }

    public void signInEmpty() throws InterruptedException {
        signIn.click();
        Thread.sleep(1000);
        signInButton.click();
        Thread.sleep(3000);
    }

    public void NonExistingUser() throws InterruptedException {

        signIn.click();
        Thread.sleep(1000);
        userName.sendKeys("asdadasdaa");
        password.sendKeys("test123");
        signInButton.click();
        Thread.sleep(2000);

    }

    public Boolean isLogoutDisplayed(){

        return  logout.isDisplayed();

    }

}
