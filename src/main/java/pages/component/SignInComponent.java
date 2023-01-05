package pages.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WaitHelper.waitCustomClickable;
import static utils.WaitHelper.waitCustomVisibleOf;

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
        waitCustomVisibleOf(userNameButton);
        userNameButton.sendKeys(text);
    }

    public void setTextPassword(String text) {
        waitCustomVisibleOf(passwordButton);
        passwordButton.sendKeys(text);
    }

    public void clickSignInButton() {
        waitCustomClickable(signInButton);
        signInButton.click();
    }
}
