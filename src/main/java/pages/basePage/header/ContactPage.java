package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {


    @FindBy(css="[onclick='send()']")
    private WebElement sendButton;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void openContact() throws InterruptedException {
        getHeader().clickContactButton();
        Thread.sleep(1000);
        clickSendButton();
        Thread.sleep(3000);
    }
}
