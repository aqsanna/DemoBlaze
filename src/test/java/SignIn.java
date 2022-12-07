import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;
import utils.SeleniumUtils;

public class SignIn extends BaseTest {

    SignInPage signInPage;
    SeleniumUtils utils = new SeleniumUtils(driver);

    @Test(priority = 1, groups = { "functest" })
    public void checkSignIn() throws InterruptedException {
        signInPage  = new SignInPage(driver);
        signInPage.signInSuccess();
        Assert.assertTrue(new SignInPage(driver).isLogoutDisplayed(), "Your login was successful");
    }

    @Test(priority = 2)
    public void checkEmptySignIn() throws InterruptedException {
        signInPage.signInEmpty();
        Assert.assertEquals(utils.getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");

    }

    @Test(priority = 3)
    public void checkNonExistingUser() throws InterruptedException {
        signInPage.NonExistingUser();
        Assert.assertEquals(utils.getAlertText(),"User does not exist.", "Success sign in");

    }
}
