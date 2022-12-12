package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {


    By placeOrder = By.cssSelector(".btn.btn-success");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCart() throws InterruptedException {
        getHeader().clickCartButton();
        Thread.sleep(2000);
    }

    public Boolean isPlaceOrderDisplayed() {
        return driver.findElement(placeOrder).isDisplayed();

    }
}
