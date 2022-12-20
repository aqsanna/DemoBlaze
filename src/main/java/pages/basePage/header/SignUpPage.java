package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.component.SignUpComponent;
import utils.ExistingUser;
import utils.StringUtilsUsername;
import utils.StringUtilsPassword;

import java.time.Duration;

public class SignUpPage extends BasePage {

    SignUpComponent signUpComponent = new SignUpComponent(driver);
    @FindBy(id="signin2")
    private WebElement signUp;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUp() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(signUp));
        signUp.click();
    }

    public void signUpSuccess() throws InterruptedException {
        clickSignUp();
        signUpComponent.setTextUserName(StringUtilsUsername.randomStringUtilsUsername());
        signUpComponent.setTextPassword(StringUtilsPassword.correctPassword());
        signUpComponent.clickSignUpButton();
    }

    public void signUpEmpty() throws InterruptedException {
        clickSignUp();
        signUpComponent.clickSignUpButton();
    }

    public void signUpExistingInfo() throws InterruptedException {
        clickSignUp();
        signUpComponent.setTextUserName(ExistingUser.USERNAME);
        signUpComponent.setTextPassword(ExistingUser.PASSWORD);
        signUpComponent.clickSignUpButton();
    }

}
