package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.component.SignInComponent;
import utils.ExistingUser;
import utils.StringUtilsPassword;
import utils.StringUtilsUsername;

import java.time.Duration;

public class SignInPage extends BasePage {

    SignInComponent signInComponent = new SignInComponent(driver);
    @FindBy(id = "login2")
    private WebElement login;

    public SignInPage(WebDriver driver) {
        super(driver);

    }

    public void clickLogin() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(login));
        login.click();
    }

    public void signInSuccess() throws InterruptedException {
        clickLogin();
        signInComponent.setTextUserName(ExistingUser.USERNAME);
        signInComponent.setTextPassword(ExistingUser.PASSWORD);
        signInComponent.clickSignInButton();
    }

    public void signInEmpty() throws InterruptedException {
        clickLogin();
        signInComponent.clickSignInButton();
    }

    public void NonExistingUser() throws InterruptedException {
        clickLogin();
        signInComponent.setTextUserName(StringUtilsUsername.randomStringUtilsUsername());
        signInComponent.setTextPassword(StringUtilsPassword.correctPassword());
        signInComponent.clickSignInButton();
    }

}
