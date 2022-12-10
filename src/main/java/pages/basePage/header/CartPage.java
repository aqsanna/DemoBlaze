package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    WebElement placeOrder;
    BasePage basePage = new BasePage(driver);

    public CartPage(WebDriver driver) {
        super(driver);
        placeOrder = driver.findElement(By.cssSelector(".btn.btn-success"));
    }

    public void openCart() throws InterruptedException {
        basePage.cart.click();
        Thread.sleep(2000);
    }

    public Boolean isDisplayed() {
        return placeOrder.isDisplayed();

    }
}
