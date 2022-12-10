package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOutPageH extends HomePageH {
    public WebElement logOut;
    public WebElement userName;

    public SignOutPageH(WebDriver driver) {
        super(driver);
        logOut =driver.findElement(By.id("logout2"));
        userName =driver.findElement(By.id("nameofuser"));

    }

    public Boolean isLogoutDisplayed(){
        return  logOut.isDisplayed();
    }
    public Boolean isUserNametDisplayed(){
        return  userName.isDisplayed();
    }
}
