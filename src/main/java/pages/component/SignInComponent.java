package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Wait;

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
        Wait.waitVisibleElement(driver,userNameButton);
        userNameButton.sendKeys(text);
    }

    public void setTextPassword(String text) {
        Wait.waitVisibleElement(driver, passwordButton);
        passwordButton.sendKeys(text);
    }

    public void clickSignInButton() {
        Wait.waitElementToBeClickable(driver, signInButton);
        signInButton.click();
    }
}
