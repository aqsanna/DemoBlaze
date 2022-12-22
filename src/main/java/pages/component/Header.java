package pages.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(contactButtonSelector));
        contactButtonSelector.click();
    }

    public void clickAboutUsButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(aboutUsButtonSelector));
        aboutUsButtonSelector.click();
    }

    public void clickCartButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(cartButtonSelector));
        cartButtonSelector.click();
    }

    public void clickHomeButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homeButtonSelector));
        homeButtonSelector.click(); }
}
