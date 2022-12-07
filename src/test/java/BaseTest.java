import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverManager.getDriver();
        driver.get("https://www.demoblaze.com/index.html");
    }

    @AfterMethod
    protected void pageClose(){
        driver.quit();
    }
}
