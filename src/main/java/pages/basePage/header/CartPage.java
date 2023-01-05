package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaitHelper.waitCustomVisibleOf;

public class CartPage extends BasePage {

    @FindBy(css = ".btn.btn-success")
    private WebElement placeOrder;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return null;
    }

    public void openCart() {
        getHeader().clickCartButton();
    }

    public Boolean isPlaceOrderDisplayed() {
        waitCustomVisibleOf(placeOrder);
        return placeOrder.isDisplayed();

    }
}
