import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.SignInPage;
import pages.basePage.header.SignOutPageH;
import utils.SeleniumUtils;

public class SignIn extends BaseTest {

    SignInPage signInPage;

    @Test(priority = 1, groups = { "functest" })
    public void checkSignIn() throws InterruptedException {
        signInPage = new SignInPage(driver);
        signInPage.signInSuccess();
        Assert.assertTrue(new SignOutPageH(driver).isLogoutDisplayed());
        Assert.assertTrue(new SignOutPageH(driver).isUserNametDisplayed());
    }

    @Test(priority = 2)
    public void checkEmptySignIn() throws InterruptedException {
        signInPage = new SignInPage(driver);
        signInPage.signInEmpty();
        Assert.assertEquals(new SeleniumUtils(driver).getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");

    }

    @Test(priority = 3)
    public void checkNonExistingUser() throws InterruptedException {
        signInPage = new SignInPage(driver);
        signInPage.NonExistingUser();
        Assert.assertEquals(new SeleniumUtils(driver).getAlertText(),"User does not exist.", "Success sign in");

    }
}
