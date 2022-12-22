package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUsPage extends BasePage {

    @FindBy(className="vjs-big-play-button")
    private WebElement playButton;

    public AboutUsPage(WebDriver driver) {
        super(driver);

    }

    public void openAboutUs() throws InterruptedException {
        getHeader().clickAboutUsButton();
        clickPlayButton();
    }

    public Boolean isPlayButtonEnabled() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.invisibilityOf(playButton));
        return playButton.isEnabled();

    }
    public void clickPlayButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(playButton));
        playButton.click();
    }
}
