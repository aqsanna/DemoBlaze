package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    By CaruselBanner =By.className("carousel-inner");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHome() throws InterruptedException {
        getHeader().clickHomeButton();
        Thread.sleep(2000);
    }
    public Boolean isBannerDisplayed(){
        return driver.findElement(CaruselBanner).isDisplayed();
    }
}
