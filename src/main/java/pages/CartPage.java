package pages;

import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CartPage extends DriverManager {


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCart() throws InterruptedException {
        DriverManager.getDriver();
        WebElement cart = driver.findElement(By.id("cartur"));
        cart.click();
        Thread.sleep(2000);
    }

    public Boolean isDisplayed(){
        Boolean PlaceOrder = driver.findElement(By.cssSelector(".btn.btn-success")).isDisplayed();
        return PlaceOrder;

    }
}