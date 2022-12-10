package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;
    public WebElement home;
    public WebElement contact;
    public WebElement aboutUs;
    public WebElement cart;

    public BasePage(WebDriver driver){
        this.driver=driver;
        //home = driver.findElement(By.linkText("Home "));
        contact = driver.findElement(By.linkText("Contact"));
        aboutUs = driver.findElement(By.linkText("About us"));
        cart = driver.findElement(By.id("cartur"));
    }
}
