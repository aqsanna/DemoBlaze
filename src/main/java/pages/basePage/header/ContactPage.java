package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitHelper;

import static utils.WaitHelper.waitCustomInVisible;

public class ContactPage extends BasePage {

    @FindBy(css="[onclick='send()']")
    private WebElement sendButton;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return null;
    }

    public void clickSendButton() {
      //  WaitHelper.waitInVisibleElement(driver,sendButton);
        waitCustomInVisible(sendButton);
        sendButton.click();
    }

    public void openContact(){
        getHeader().clickContactButton();
        clickSendButton();
    }
}
