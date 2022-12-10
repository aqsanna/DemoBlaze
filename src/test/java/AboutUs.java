import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.AboutUsPage;

public class AboutUs extends BaseTest{

    AboutUsPage aboutUsPage;

    @Test
    public void checkOpenAboutUs() throws InterruptedException {
        aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.openAboutUs();
        Assert.assertTrue(aboutUsPage.isDisplayed(), "The About page doesn't open or the video can't be played");

    }
}
