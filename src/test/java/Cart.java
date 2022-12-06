import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class Cart {
    WebDriver driver;
    CartPage cartPage = new CartPage(driver);

    @Test
    public void checkOpenCart() throws InterruptedException {
        cartPage.openCart();
        Assert.assertTrue(cartPage.isDisplayed(), "Cart section not opening");
        cartPage.pageClose();
    }
}
