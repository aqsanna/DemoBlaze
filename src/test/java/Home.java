import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.HomePage;

import java.io.IOException;

public class Home extends BaseTest{

    HomePage homePage;

    @Test
    public void checkOpenHomePage() throws InterruptedException, IOException {
        homePage = new HomePage(driver);
        homePage.get();
        homePage.openHome();
        Assert.assertTrue(homePage.isBannerDisplayed(),"Home page is not opening");

    }
}
