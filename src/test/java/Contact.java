import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactPage;
import seleniumUtils.SeleniumUtils;

public class Contact {
    WebDriver driver;
    ContactPage contactPage = new ContactPage(driver);
    SeleniumUtils utils = new SeleniumUtils(driver);

    @Test
    public void checkContact() throws InterruptedException {
        contactPage.openContact();
        Assert.assertEquals(utils.getAlertText(),"Thanks for the message!!", "Message can't sent" );
        contactPage.pageClose();
    }
}
