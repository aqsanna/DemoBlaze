import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class Cart {
    WebDriver driver;
    CartPage cartPage = new CartPage(driver);

    public void checkOpenCart() throws InterruptedException {
        cartPage.openCart();
        if(cartPage.isDisplayed().equals(true)){
            System.out.println("Cart section is open");
        }
        else{
            System.out.println("Cart section not opening");
        }
        cartPage.pageClose();
    }
}
