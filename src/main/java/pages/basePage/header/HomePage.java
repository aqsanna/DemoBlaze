package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {


    @FindBy(css = ".carousel-inner")
    private WebElement CaruselBanner;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHome() throws InterruptedException {
        getHeader().clickHomeButton();
    }

    public Boolean isBannerDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CaruselBanner));
        return CaruselBanner.isDisplayed();
    }
}
