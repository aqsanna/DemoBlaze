package pages.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.WaitHelper.waitCustomVisibleOf;

public class Header {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css =".nav-item.active .nav-link")
    WebElement homeButtonSelector;
    @FindBy(linkText="Contact")
    WebElement contactButtonSelector;
    @FindBy(linkText="About us")
    WebElement aboutUsButtonSelector;
    @FindBy(id="cartur")
    WebElement cartButtonSelector;


    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickContactButton() {
        waitCustomVisibleOf(contactButtonSelector);
        contactButtonSelector.click();
    }

    public void clickAboutUsButton() {
        waitCustomVisibleOf(aboutUsButtonSelector);
        aboutUsButtonSelector.click();
    }

    public void clickCartButton() {
        waitCustomVisibleOf(cartButtonSelector);
        cartButtonSelector.click();
    }

    public void clickHomeButton() {
        waitCustomVisibleOf(homeButtonSelector);
        homeButtonSelector.click(); }
}