package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaitHelper.waitCustomVisibleOf;

public class SignOutPage extends BasePage {

    @FindBy(id="logout2")
    private WebElement logOut;
    @FindBy(id="nameofuser")
    private WebElement userName;


    public SignOutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return null;
    }

    public Boolean isLogoutDisplayed() {
        waitCustomVisibleOf(logOut);
        return logOut.isDisplayed();
    }

    public Boolean isUserNametDisplayed() {
        waitCustomVisibleOf(userName);
        return userName.isDisplayed();
    }
}
