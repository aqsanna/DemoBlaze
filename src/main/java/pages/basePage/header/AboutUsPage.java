package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage {

    @FindBy(className="vjs-big-play-button")
    private WebElement playButton;

    public AboutUsPage(WebDriver driver) {
        super(driver);

    }

    public void openAboutUs() throws InterruptedException {
        getHeader().clickAboutUsButton();
        Thread.sleep(1000);
        clickPlayButton();
        Thread.sleep(1000);
    }

    public Boolean isPlayButtonDisplayed() {
        return playButton.isEnabled();

    }
    public void clickPlayButton(){
        playButton.click();
    }
}
