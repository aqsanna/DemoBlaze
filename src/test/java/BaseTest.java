import driver.CustomDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.basePage.header.BasePage;
import utils.Configurations;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {
        BasePage basePage = null;
       // basePage.get();
        driver = CustomDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Configurations.URL);
    }

    @AfterMethod
    protected void pageClose(){
        driver.quit();
        CustomDriver.setDriver(null);
    }
}
