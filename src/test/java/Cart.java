import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.CartPage;

@Test
public class Cart extends BaseTest {

    CartPage cartPage;

    @Test
    public void checkOpenCart() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.openCart();
        Assert.assertTrue(cartPage.isPlaceOrderDisplayed(), "Cart section not opening");
    }
}
