package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.component.SignUpComponent;
import utils.ExistingUser;
import utils.StringUtilsPassword;
import utils.StringUtilsUsername;

import static utils.WaitHelper.waitCustomVisibleOf;

public class SignUpPage extends BasePage {

    SignUpComponent signUpComponent = new SignUpComponent(driver);
    @FindBy(id="signin2")
    private WebElement signUp;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return null;
    }

    public void clickSignUp() {
        waitCustomVisibleOf(signUp);
        signUp.click();
    }

    public void signUpSuccess()  {
        clickSignUp();
        signUpComponent.setTextUserName(StringUtilsUsername.randomStringUtilsUsername());
        signUpComponent.setTextPassword(StringUtilsPassword.correctPassword());
        signUpComponent.clickSignUpButton();
    }

    public void signUpEmpty() {
        clickSignUp();
        signUpComponent.clickSignUpButton();
    }

    public void signUpExistingInfo()  {
        clickSignUp();
        signUpComponent.setTextUserName(ExistingUser.USERNAME);
        signUpComponent.setTextPassword(ExistingUser.PASSWORD);
        signUpComponent.clickSignUpButton();
    }

}
