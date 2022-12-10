package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends BasePage {

    WebElement playButton;
    BasePage basePage = new BasePage(driver);

    public AboutUsPage(WebDriver driver) {
        super(driver);
        playButton = driver.findElement(By.className("vjs-big-play-button"));
    }

    public void openAboutUs() throws InterruptedException {
        basePage.aboutUs.click();
        Thread.sleep(1000);
        playButton.click();
        Thread.sleep(1000);
    }

    public Boolean isDisplayed() {
        return playButton.isEnabled();

    }
}
