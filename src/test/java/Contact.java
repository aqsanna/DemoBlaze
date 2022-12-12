import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.ContactPage;

public class Contact extends BaseTest{

    ContactPage contactPage;

    @Test
    public void checkContact() throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.openContact();
        Assert.assertEquals(contactPage.getAlertText(),"Thanks for the message!!", "Message can't sent" );
    }
}
