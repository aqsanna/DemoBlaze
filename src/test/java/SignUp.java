import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUp {
    WebDriver driver;
    SignUpPage signUpPage = new SignUpPage(driver);

    @Test(priority = 1)
    public void checkSignUp() throws InterruptedException {
        signUpPage.signUpSuccess();
        Assert.assertEquals(signUpPage.getAlertText(), "Sign up successful.", "Sign up is failed");
        signUpPage.pageClose();
    }

    @Test(priority = 2)
    public void checkEmptySignUp() throws InterruptedException {
        signUpPage.signUpEmpty();
        Assert.assertEquals(signUpPage.getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");
        signUpPage.pageClose();
    }

    @Test(priority = 3)
    public void checkExistingInfoSignUp() throws InterruptedException {
        signUpPage.signUpExistingInfo();
        Assert.assertEquals(signUpPage.getAlertText(), "This user already exist.", "This user not exist.");
        signUpPage.pageClose();

    }

}
