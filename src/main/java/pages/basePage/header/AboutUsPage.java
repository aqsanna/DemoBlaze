package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class AboutUsPage extends BasePage {

    @FindBy(className="vjs-big-play-button")
    private WebElement playButton;

    public AboutUsPage(WebDriver driver) {
        super(driver);

    }

    public void openAboutUs()  {
        getHeader().clickAboutUsButton();
        clickPlayButton();
    }

    public Boolean isPlayButtonEnabled() {
        Wait.waitInVisibleElement(driver, playButton);
        return playButton.isEnabled();

    }
    public void clickPlayButton(){
        Wait.waitVisibleElement(driver, playButton);
        playButton.click();
    }
}
