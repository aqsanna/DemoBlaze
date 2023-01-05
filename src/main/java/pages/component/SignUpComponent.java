package pages.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WaitHelper.waitCustomClickable;
import static utils.WaitHelper.waitCustomVisibleOf;

public class SignUpComponent {
    WebDriver driver;
    @FindBy(id = "sign-username")
    WebElement userName;
    @FindBy(id = "sign-password")
    WebElement userPass;
    @FindBy(css = "[onclick='register()']")
    WebElement signUpButton;

    public SignUpComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTextUserName(String text) {
        waitCustomVisibleOf(userName);
        userName.sendKeys(text);
    }

    public void setTextPassword(String text) {
        waitCustomVisibleOf(userPass);
        userPass.sendKeys(text);
    }

    public void clickSignUpButton() {
        waitCustomClickable(signUpButton);
        signUpButton.click();
    }
}