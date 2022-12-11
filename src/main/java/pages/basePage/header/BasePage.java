package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    By homeButton = By.cssSelector(".nav-item.active .nav-link");
    By contactButton = By.linkText("Contact");
    By aboutUsButton = By.linkText("About us");
    By cartButton = By.id("cartur");


    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public void clickContactButton(){
        driver.findElement(contactButton).click();
    }
    public void clickAboutUsButton(){
        driver.findElement(aboutUsButton).click();
    }
    public void clickCartButton(){
        driver.findElement(cartButton).click();
    }
    public void clickHomeButton(){
        driver.findElement(homeButton).click();
    }
}
