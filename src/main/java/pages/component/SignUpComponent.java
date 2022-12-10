package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpComponent {
    WebDriver driver;
    public WebElement userName;
    public WebElement userPass;
    public WebElement signUpButton;

    public SignUpComponent(WebDriver driver) {
        this.driver = driver;
        userName = driver.findElement(By.id("sign-username"));
        userPass = driver.findElement(By.id("sign-password"));
        signUpButton = driver.findElement(By.cssSelector("[onclick='register()']"));
    }
}