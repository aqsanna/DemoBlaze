package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOutPage extends BasePage {

    @FindBy(id="logout2")
    private WebElement logOut;
    @FindBy(id="nameofuser")
    private WebElement userName;


    public SignOutPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isLogoutDisplayed() {
        return logOut.isDisplayed();
    }

    public Boolean isUserNametDisplayed() {
        return userName.isDisplayed();
    }
}
