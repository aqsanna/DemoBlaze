import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.ContactPage;
import utils.SeleniumUtils;

public class Contact extends BaseTest{

    ContactPage contactPage;
    SeleniumUtils utils = new SeleniumUtils(driver);

    @Test
    public void checkContact() throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.openContact();
        Assert.assertEquals(new SeleniumUtils(driver).getAlertText(),"Thanks for the message!!", "Message can't sent" );
    }
}
