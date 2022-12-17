package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {


    @FindBy(css=".btn.btn-success")
    private WebElement placeOrder;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCart() throws InterruptedException {
        getHeader().clickCartButton();
        Thread.sleep(2000);
    }

    public Boolean isPlaceOrderDisplayed() {
        return placeOrder.isDisplayed();

    }
}
