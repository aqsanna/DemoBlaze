package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaitHelper.waitCustomInVisible;
import static utils.WaitHelper.waitCustomVisibleOf;

public class AboutUsPage extends BasePage {

    @FindBy(className="vjs-big-play-button")
    private WebElement playButton;

    public AboutUsPage(WebDriver driver) {
        super(driver);

    }

    @Override
    public String getPageUrl() {
        return null;
    }

    public void openAboutUs()  {
        getHeader().clickAboutUsButton();
        clickPlayButton();
    }

    public Boolean isPlayButtonEnabled() {
        waitCustomInVisible(playButton);
        return playButton.isEnabled();

    }
    public void clickPlayButton(){
        waitCustomVisibleOf(playButton);
        playButton.click();
    }
}
