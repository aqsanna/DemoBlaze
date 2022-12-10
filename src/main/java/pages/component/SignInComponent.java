package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInComponent {
    WebDriver driver;
    public WebElement userName;
    public WebElement password;
    public WebElement signInButton;

    public SignInComponent(WebDriver driver){
        this.driver=driver;
        userName = driver.findElement(By.id("loginusername"));
        password = driver.findElement(By.id("loginpassword"));
        signInButton = driver.findElement(By.cssSelector("[onclick='logIn()']"));
    }
}
