package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage {


    @FindBy(css=".btn.btn-success")
    private WebElement placeOrder;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCart() throws InterruptedException {
        getHeader().clickCartButton();
    }

    public Boolean isPlaceOrderDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(placeOrder));
        return placeOrder.isDisplayed();

    }
}
