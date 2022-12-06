import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactPage;

public class Contact {
    WebDriver driver;
    ContactPage contactPage = new ContactPage(driver);

    @Test
    public void checkContact() throws InterruptedException {
        contactPage.openContact();
        Assert.assertEquals(contactPage.getAlertText(),"Thanks for the message!!", "Message can't sent" );
        contactPage.pageClose();
    }
}
