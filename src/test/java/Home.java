import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.HomePage;

public class Home extends BaseTest{

    HomePage homePage;

    @Test
    public void checkOpenHomePage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.openHome();
        Assert.assertTrue(homePage.isBannerDisplayed(),"Home page is not opening");

    }
}
