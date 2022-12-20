package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInComponent {
    WebDriver driver;
    @FindBy(id="loginusername")
    WebElement userNameButton;
    @FindBy(id="loginpassword")
    WebElement passwordButton;
    @FindBy(css="[onclick='logIn()']")
    WebElement signInButton;


    public SignInComponent(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTextUserName(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(userNameButton));
        userNameButton.sendKeys(text);
    }

    public void setTextPassword(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(passwordButton));
        passwordButton.sendKeys(text);
    }

    public void clickSignInButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }
}
