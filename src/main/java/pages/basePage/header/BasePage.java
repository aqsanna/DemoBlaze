package pages.basePage.header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.component.Header;

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
        return driver.switchTo().alert().getText();
    }





}
