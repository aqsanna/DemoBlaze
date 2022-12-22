package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Wait;

import java.time.Duration;

public class SignOutPage extends BasePage {

    @FindBy(id="logout2")
    private WebElement logOut;
    @FindBy(id="nameofuser")
    private WebElement userName;


    public SignOutPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isLogoutDisplayed() {
        Wait.waitVisibleElement(driver, logOut);
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logOut));
        return logOut.isDisplayed();
    }

    public Boolean isUserNametDisplayed() {
        Wait.waitVisibleElement(driver, userName);
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(userName));
        return userName.isDisplayed();
    }
}
