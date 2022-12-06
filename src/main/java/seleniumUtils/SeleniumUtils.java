package seleniumUtils;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils extends DriverManager {

    public SeleniumUtils(WebDriver driver) {
        super(driver);
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
}
