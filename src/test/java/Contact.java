import org.openqa.selenium.WebDriver;
import pages.ContactPage;

public class Contact {
    WebDriver driver;
    ContactPage contactPage = new ContactPage(driver);

    public void checkContact() throws InterruptedException {
        contactPage.openContact();
        if(contactPage.getAlertText().equals("Thanks for the message!!")){
            System.out.println("Message is sent");
        }
        else {
            System.out.println("Message can't sent");
        }
        contactPage.pageClose();
    }
}
