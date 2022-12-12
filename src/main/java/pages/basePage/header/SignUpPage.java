package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.component.SignUpComponent;
import utils.ExistingUser;
import utils.StringUtils;

public class SignUpPage extends BasePage {

    SignUpComponent signUpComponent = new SignUpComponent(driver);
    By signUp = By.id("signin2");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUp() {
        driver.findElement(signUp).click();
    }

    public void signUpSuccess() throws InterruptedException {
        clickSignUp();
        Thread.sleep(3000);
        signUpComponent.setTextUserName(StringUtils.correctPassword());
        signUpComponent.setTextPassword(StringUtils.correctPassword());
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
