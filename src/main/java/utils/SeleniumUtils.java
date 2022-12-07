package utils;

import org.openqa.selenium.WebDriver;

public class SeleniumUtils  {

    WebDriver driver;
    public SeleniumUtils(WebDriver driver) {
        this.driver=driver;
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
}
