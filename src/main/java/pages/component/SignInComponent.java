package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInComponent {
    WebDriver driver;
    By userNameButton = By.id("loginusername");
    By passwordButton = By.id("loginpassword");
    By signInButton = By.cssSelector("[onclick='logIn()']");


    public SignInComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void setTextUserName(String text) {
        driver.findElement(userNameButton).sendKeys(text);
    }

    public void setTextPassword(String text) {
        driver.findElement(passwordButton).sendKeys(text);
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }
}
