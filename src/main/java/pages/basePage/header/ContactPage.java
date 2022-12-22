package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class ContactPage extends BasePage {

    @FindBy(css="[onclick='send()']")
    private WebElement sendButton;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void clickSendButton() {
        Wait.waitInVisibleElement(driver,sendButton);
        sendButton.click();
    }

    public void openContact(){
        getHeader().clickContactButton();
        clickSendButton();
    }
}
