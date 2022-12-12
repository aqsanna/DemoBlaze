package pages.basePage.header;
import org.openqa.selenium.WebDriver;
import pages.component.Header;

public class BasePage {
    protected WebDriver driver;
    protected Header header;

    public BasePage(WebDriver driver){
        this.driver=driver;
        header = new Header(this.driver);
    }
    public Header getHeader(){
        return header;
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }





}
