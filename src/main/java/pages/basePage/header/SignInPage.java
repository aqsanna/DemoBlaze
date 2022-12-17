package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.component.SignInComponent;
import utils.ExistingUser;
import utils.StringUtilsPassword;
import utils.StringUtilsUsername;

public class SignInPage extends BasePage {

    SignInComponent signInComponent = new SignInComponent(driver);
    @FindBy(id = "login2")
    private WebElement login;

    public SignInPage(WebDriver driver) {
        super(driver);

    }

    public void clickLogin() {
        login.click();
    }

    public void signInSuccess() throws InterruptedException {
        clickLogin();
        Thread.sleep(1000);
        signInComponent.setTextUserName(ExistingUser.USERNAME);
        signInComponent.setTextPassword(ExistingUser.PASSWORD);
        signInComponent.clickSignInButton();
        Thread.sleep(3000);
    }

    public void signInEmpty() throws InterruptedException {
        clickLogin();
        Thread.sleep(1000);
        signInComponent.clickSignInButton();
        Thread.sleep(3000);
    }

    public void NonExistingUser() throws InterruptedException {

        clickLogin();
        Thread.sleep(1000);
        signInComponent.setTextUserName(StringUtilsUsername.randomStringUtilsUsername());
        signInComponent.setTextPassword(StringUtilsPassword.correctPassword());
        signInComponent.clickSignInButton();
        Thread.sleep(2000);

    }

}
