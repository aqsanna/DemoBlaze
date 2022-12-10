import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.CartPage;

public class Cart extends BaseTest {

    CartPage cartPage;

    @Test
    public void checkOpenCart() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.openCart();
        driver.get("https://www.demoblaze.com/cart.html");
        Assert.assertTrue(new CartPage(driver).isDisplayed(), "Cart section not opening");
    }
}
