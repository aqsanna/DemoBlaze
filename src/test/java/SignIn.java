import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.basePage.header.SignInPage;
import pages.basePage.header.SignOutPage;
import utils.StringUtilsUsername;

public class SignIn extends BaseTest {

    SignInPage signInPage;

    @BeforeMethod
    public void signIn(){
        signInPage = new SignInPage(driver);
    }

    @Test(priority = 1, groups = { "functest" })
    public void checkSignIn()  {
        signInPage.signInSuccess();
        Assert.assertTrue(new SignOutPage(driver).isLogoutDisplayed());
        Assert.assertTrue(new SignOutPage(driver).isUserNametDisplayed());
    }

    @Test(priority = 2)
    public void checkEmptySignIn() {
        signInPage.signInEmpty();
        Assert.assertEquals(signInPage.getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");

    }

    @Test(priority = 3)
    public void checkNonExistingUser() {
        signInPage.NonExistingUser();
        Assert.assertEquals(signInPage.getAlertText(),"User does not exist.", "Success sign in");
        //System.out.println(StringUtilsUsername.randomStringUtilsUsername());

    }
}
