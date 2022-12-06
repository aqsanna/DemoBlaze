import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.SignInPage;
import pages.SignUpPage;
import seleniumUtils.SeleniumUtils;

public class SignIn {
    WebDriver driver;
    SignInPage signInPage = new SignInPage(driver);
    SeleniumUtils utils = new SeleniumUtils(driver);

    @Test(priority = 1)
    public void checkSignIn() throws InterruptedException {
        signInPage.signInSuccess();
        Assert.assertTrue(signInPage.isDisplayed(), "Your login was successful");
        signInPage.pageClose();
    }

    @Test(priority = 2)
    public void checkEmptySignIn() throws InterruptedException {
        signInPage.signInEmpty();
        Assert.assertEquals(utils.getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");
        signInPage.pageClose();
    }

    @Test(priority = 3)
    public void checkNonExistingUser() throws InterruptedException {
        signInPage.NonExistingUser();
        Assert.assertEquals(utils.getAlertText(),"User does not exist.", "Success sign in");
        signInPage.pageClose();
    }
}
