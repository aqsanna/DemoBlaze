package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CartPage {
    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";

    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public static ChromeOptions setOptions(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        return option;
    }
    public void openCart() throws InterruptedException {
        driver = new ChromeDriver(setOptions());
        driver.get(url);
        WebElement cart = driver.findElement(By.id("cartur"));
        cart.click();
        Thread.sleep(2000);
    }

    public Boolean isDisplayed(){
        Boolean PlaceOrder = driver.findElement(By.cssSelector(".btn.btn-success")).isDisplayed();
        return PlaceOrder;

    }
    public void pageClose(){
        driver.quit();
    }

}
