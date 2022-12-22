package pages.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Wait;

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
        Wait.waitVisibleElement(driver, contactButtonSelector);
        contactButtonSelector.click();
    }

    public void clickAboutUsButton() {
        Wait.waitVisibleElement(driver, aboutUsButtonSelector);
        aboutUsButtonSelector.click();
    }

    public void clickCartButton() {
        Wait.waitVisibleElement(driver,cartButtonSelector);
        cartButtonSelector.click();
    }

    public void clickHomeButton() {
        Wait.waitVisibleElement(driver,homeButtonSelector);
        homeButtonSelector.click(); }
}
