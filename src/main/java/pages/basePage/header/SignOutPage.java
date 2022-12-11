package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage extends BasePage {

    By logOut = By.id("logout2");
    By userName = By.id("nameofuser");


    public SignOutPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isLogoutDisplayed() {
        return driver.findElement(logOut).isDisplayed();
    }

    public Boolean isUserNametDisplayed() {
        return driver.findElement(userName).isDisplayed();
    }
}
