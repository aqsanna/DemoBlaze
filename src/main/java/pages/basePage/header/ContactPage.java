package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {


    By sendButton = By.cssSelector("[onclick='send()']");

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public void openContact() throws InterruptedException {
        clickContactButton();
        Thread.sleep(1000);
        clickSendButton();
        Thread.sleep(3000);
    }
}
