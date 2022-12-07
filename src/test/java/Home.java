import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class Home {
    WebDriver driver;
    HomePage homePage = new HomePage(driver);

    @Test
    public void checkOpenHomePage(){
        Assert.assertTrue(homePage.isDisplayed(),"Home page is not opening");

    }
}
