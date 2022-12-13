package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
    WebDriver driver;
    By homeButtonSelector = By.cssSelector(".nav-item.active .nav-link");
    By contactButtonSelector = By.linkText("Contact");
    By aboutUsButtonSelector = By.linkText("About us");
    By cartButtonSelector = By.id("cartur");


    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContactButton() {
        driver.findElement(contactButtonSelector).click();
    }

    public void clickAboutUsButton() {
        driver.findElement(aboutUsButtonSelector).click();
    }

    public void clickCartButton() {
        driver.findElement(cartButtonSelector).click();
    }

    public void clickHomeButton() {driver.findElement(homeButtonSelector).click(); }
}
