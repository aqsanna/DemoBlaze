package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends BasePage {

    WebElement sendButton;
    BasePage basePage = new BasePage(driver);

    public ContactPage(WebDriver driver) {
        super(driver);
        sendButton = driver.findElement(By.cssSelector("[onclick='send()']"));
    }

    public void openContact() throws InterruptedException {
        basePage.contact.click();
        Thread.sleep(1000);
        sendButton.click();
        Thread.sleep(3000);
    }
}
