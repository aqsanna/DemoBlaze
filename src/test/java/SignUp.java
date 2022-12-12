import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.SignUpPage;

public class SignUp extends BaseTest{


    SignUpPage signUpPage;

    @Test(priority = 1)
    public void checkSignUp() throws InterruptedException {
        signUpPage = new SignUpPage(driver);
        signUpPage.signUpSuccess();
        Assert.assertEquals(signUpPage.getAlertText(), "Sign up successful.", "Sign up is failed");
    }

    @Test(priority = 2)
    public void checkEmptySignUp() throws InterruptedException {
        signUpPage = new SignUpPage(driver);
        signUpPage.signUpEmpty();
        Assert.assertEquals(signUpPage.getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");
    }

    @Test(priority = 3)
    public void checkExistingInfoSignUp() throws InterruptedException {
        signUpPage = new SignUpPage(driver);
        signUpPage.signUpExistingInfo();
        Assert.assertEquals(signUpPage.getAlertText(), "This user already exist.", "This user not exist.");

    }

}
