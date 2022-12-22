import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Configurations;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Configurations.URL);
    }

    @AfterMethod
    protected void pageClose(){
        driver.quit();
        DriverManager.setDriver(null);
    }
}
