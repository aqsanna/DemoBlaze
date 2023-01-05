package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

import static utils.WaitHelper.waitCustomVisibleOf;

public class HomePage extends BasePage {


    @FindBy(css = ".carousel-inner")
    private WebElement CaruselBanner;
    private static String homeUrl= "https://www.demoblaze.com/index.html";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return null;
    }

    public void openHome()  {
        getHeader().clickHomeButton();
    }

    public Boolean isBannerDisplayed() {
        waitCustomVisibleOf(CaruselBanner);
        return CaruselBanner.isDisplayed();
    }

    @Override
    protected void load() {
        driver.get(homeUrl);
    }

    @Override
    protected void isLoaded() throws Error, IOException {
       super.isLoaded();
        waitCustomVisibleOf(CaruselBanner);
    }
}
