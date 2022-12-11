package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends BasePage {

    By playButton = By.className("vjs-big-play-button");

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public void openAboutUs() throws InterruptedException {
        clickAboutUsButton();
        Thread.sleep(1000);
        clickPlayButton();
        Thread.sleep(1000);
    }

    public Boolean isPlayButtonDisplayed() {
        return driver.findElement(playButton).isEnabled();

    }
    public void clickPlayButton(){
        driver.findElement(playButton).click();
    }
}
