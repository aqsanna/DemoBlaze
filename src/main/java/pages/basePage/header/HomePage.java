package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Wait;

import java.time.Duration;

public class HomePage extends BasePage {


    @FindBy(css = ".carousel-inner")
    private WebElement CaruselBanner;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHome()  {
        getHeader().clickHomeButton();
    }

    public Boolean isBannerDisplayed() {
        Wait.waitVisibleElement(driver,CaruselBanner);
        return CaruselBanner.isDisplayed();
    }
}
