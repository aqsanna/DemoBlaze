package pages.basePage.header;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.component.SignInComponent;
import utils.ExistingUser;
import utils.StringUtilsPassword;
import utils.StringUtilsUsername;
import utils.WaitHelper;

import static utils.WaitHelper.waitCustomClickable;

public class SignInPage extends BasePage {

    SignInComponent signInComponent = new SignInComponent(driver);
    @FindBy(id = "login2")
    private WebElement login;

    public SignInPage(WebDriver driver) {
        super(driver);

    }

    @Override
    public String getPageUrl() {
        return null;
    }


    public void clickLogin() {
        waitCustomClickable(login);
        login.click();
    }


    public void signInSuccess() {
        clickLogin();
        signInComponent.setTextUserName(ExistingUser.USERNAME);
        signInComponent.setTextPassword(ExistingUser.PASSWORD);
        signInComponent.clickSignInButton();
    }

    public void signInEmpty()  {
        clickLogin();
        signInComponent.clickSignInButton();
    }

    public void NonExistingUser()  {
        clickLogin();
        signInComponent.setTextUserName(StringUtilsUsername.randomStringUtilsUsername());
        signInComponent.setTextPassword(StringUtilsPassword.correctPassword());
        signInComponent.clickSignInButton();
    }

}
