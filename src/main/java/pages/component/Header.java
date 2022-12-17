package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    WebDriver driver;
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

        contactButtonSelector.click();
    }

    public void clickAboutUsButton() {

        aboutUsButtonSelector.click();
    }

    public void clickCartButton() {

        cartButtonSelector.click();
    }

    public void clickHomeButton() {
       homeButtonSelector.click(); }
}
