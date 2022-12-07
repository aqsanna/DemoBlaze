import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;

public class AboutUs {
    WebDriver driver;
    AboutUsPage aboutUsPage = new AboutUsPage(driver);

    @Test
    public void checkOpenAboutUs() throws InterruptedException {
        aboutUsPage.openAboutUs();
        Assert.assertTrue(aboutUsPage.isDisplayed(), "The About page doesn't open or the video can't be played");

    }
}
