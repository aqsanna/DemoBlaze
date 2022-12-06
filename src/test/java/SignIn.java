import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.SignInPage;
import pages.SignUpPage;

public class SignIn {
    WebDriver driver;
    SignInPage signInPage = new SignInPage(driver);

    @Test(priority = 1)
    public void checkSignIn() throws InterruptedException {
        signInPage.signInSuccess();
        Assert.assertTrue(signInPage.isDisplayed(), "Your login was successful");
        signInPage.pageClose();
    }

    @Test(priority = 2)
    public void checkEmptySignIn() throws InterruptedException {
        signInPage.signInEmpty();
        Assert.assertEquals(signInPage.getAlertText(), "Please fill out Username and Password.", "Username and password not required fields");
        signInPage.pageClose();
    }

    @Test(priority = 3)
    public void checkNonExistingUser() throws InterruptedException {
        signInPage.NonExistingUser();
        Assert.assertEquals(signInPage.getAlertText(),"User does not exist.", "Success sign in");
        signInPage.pageClose();
    }
}
