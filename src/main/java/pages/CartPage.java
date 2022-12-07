package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;

    }

    public void openCart() throws InterruptedException {
        WebElement cart = driver.findElement(By.id("cartur"));
        cart.click();
        Thread.sleep(2000);
    }

    public Boolean isDisplayed() {
        Boolean PlaceOrder = driver.findElement(By.cssSelector(".btn.btn-success")).isDisplayed();
        return PlaceOrder;

    }
}
