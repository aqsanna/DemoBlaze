package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(css = ".carousel-inner")
    private WebElement CaruselBanner;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHome() throws InterruptedException {
        getHeader().clickHomeButton();
        Thread.sleep(2000);
    }

    public Boolean isBannerDisplayed() {
        return CaruselBanner.isDisplayed();
    }
}
