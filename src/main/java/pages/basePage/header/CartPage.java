package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class CartPage extends BasePage {

    @FindBy(css = ".btn.btn-success")
    private WebElement placeOrder;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCart() {
        getHeader().clickCartButton();
    }

    public Boolean isPlaceOrderDisplayed() {
        Wait.waitVisibleElement(driver, placeOrder);
        return placeOrder.isDisplayed();

    }
}
