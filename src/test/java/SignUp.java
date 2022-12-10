import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.SignUpPage;
import utils.SeleniumUtils;

public class SignUp extends BaseTest{


    SignUpPage signUpPage = new SignUpPage(driver);

    @Test(priority = 1)
    public void checkSignUp() throws InterruptedException {
        signUpPage.signUpSuccess();
        Assert.assertEquals(new SeleniumUtils(driver).getAlertText(), "Sign up successful.", "Sign up is failed");
    }

    @Test(priority = 2)
    public void checkEmptySignUp() throws InterruptedException {
        signUpPage.signUpEmpty();
        Assert.assertEquals(new SeleniumUtils(driver).getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");
    }

    @Test(priority = 3)
    public void checkExistingInfoSignUp() throws InterruptedException {
        signUpPage.signUpExistingInfo();
        Assert.assertEquals(new SeleniumUtils(driver).getAlertText(), "This user already exist.", "This user not exist.");

    }

}
