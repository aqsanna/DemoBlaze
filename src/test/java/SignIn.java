import io.qameta.allure.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.basePage.header.SignInPage;
import pages.basePage.header.SignOutPage;
import utils.StringUtilsUsername;

import java.io.ByteArrayInputStream;

public class SignIn extends BaseTest {

    SignInPage signInPage;

    @BeforeMethod
    public void signIn(){
        signInPage = new SignInPage(driver);
    }

    @Test(priority = 1, groups = { "functest" })
    public void checkSignIn()  {
        signInPage.signInSuccess();
        SignOutPage signOutPage = new SignOutPage(driver);
        Assert.assertTrue(signOutPage.isLogoutDisplayed());
        Assert.assertTrue(signOutPage.isUserNametDisplayed());
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
    @Test(priority = 4)
    public void failurTest(){
        signInPage.NonExistingUser();
        Assert.fail();
    }
    @Test(priority = 5)
    public void skipExeption(){
       throw new SkipException("Skiping in test");
    }

    @Test(description = "Screenshot in Step")
    @Story("Story 3")
    @Severity(SeverityLevel.BLOCKER)
    @Epic("Epic for test")
    @Description("In this cool test we will check cool thing")
    public void screenshotInStepTest() {
        driver.get("https://www.google.com");
        step1();
        step2();
        step3();
    }

    @Step("Step 1")
    public void step1(){
        System.out.println("step 1");
        Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }
    @Step("Step 2 with screenshot")
    public void step2(){
        System.out.println("step 2");
        screenshot();
    }
    @Step("Step 3")
    public void step3(){
        System.out.println("step 3");
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
