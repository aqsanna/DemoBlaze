package pages.basePage.header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.component.Header;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected Header header;


    public BasePage(WebDriver driver){
        this.driver=driver;
        header = new Header(this.driver);
        PageFactory.initElements(driver, this);

    }
    public Header getHeader(){
        return header;
    }
    public String getAlertText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }





}
