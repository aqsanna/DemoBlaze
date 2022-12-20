package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactPage extends BasePage {


    @FindBy(css="[onclick='send()']")
    private WebElement sendButton;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void clickSendButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(sendButton));
        sendButton.click();
    }

    public void openContact() throws InterruptedException {
        getHeader().clickContactButton();
        clickSendButton();
    }
}
