import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import seleniumUtils.SeleniumUtils;

public class SignUp {

    WebDriver driver;
    SignUpPage signUpPage = new SignUpPage(driver);
    SeleniumUtils utils = new SeleniumUtils(driver);

    @Test(priority = 1)
    public void checkSignUp() throws InterruptedException {
        signUpPage.signUpSuccess();
        Assert.assertEquals(utils.getAlertText(), "Sign up successful.", "Sign up is failed");
        signUpPage.pageClose();
    }

    @Test(priority = 2)
    public void checkEmptySignUp() throws InterruptedException {
        signUpPage.signUpEmpty();
        Assert.assertEquals(utils.getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");
        signUpPage.pageClose();
    }

    @Test(priority = 3)
    public void checkExistingInfoSignUp() throws InterruptedException {
        signUpPage.signUpExistingInfo();
        Assert.assertEquals(utils.getAlertText(), "This user already exist.", "This user not exist.");
        signUpPage.pageClose();

    }

}
