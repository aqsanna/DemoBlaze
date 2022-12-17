package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.component.SignUpComponent;
import utils.ExistingUser;
import utils.StringUtilsUsername;
import utils.StringUtilsPassword;

public class SignUpPage extends BasePage {

    SignUpComponent signUpComponent = new SignUpComponent(driver);
    @FindBy(id="signin2")
    private WebElement signUp;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUp() {
        signUp.click();
    }

    public void signUpSuccess() throws InterruptedException {
        clickSignUp();
        Thread.sleep(3000);
        signUpComponent.setTextUserName(StringUtilsUsername.randomStringUtilsUsername());
        signUpComponent.setTextPassword(StringUtilsPassword.correctPassword());
        signUpComponent.clickSignUpButton();
        Thread.sleep(3000);
    }

    public void signUpEmpty() throws InterruptedException {
        clickSignUp();
        Thread.sleep(2000);
        signUpComponent.clickSignUpButton();
        Thread.sleep(2000);
    }

    public void signUpExistingInfo() throws InterruptedException {
        clickSignUp();
        Thread.sleep(3000);
        signUpComponent.setTextUserName(ExistingUser.USERNAME);
        signUpComponent.setTextPassword(ExistingUser.PASSWORD);
        signUpComponent.clickSignUpButton();
        Thread.sleep(3000);
    }

}
