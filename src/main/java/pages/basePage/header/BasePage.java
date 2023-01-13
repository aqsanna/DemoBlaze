package pages.basePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.component.Header;
import utils.CustomLoadableComponent;

import java.io.IOException;

import static utils.JSWaiter.waitForJQueryLoad;
import static utils.JSWaiter.waitUntilJSReady;
import static utils.WaitHelper.waitCustomAlertDisplayed;

public abstract class BasePage extends CustomLoadableComponent {
    protected WebDriver driver;
    protected Header header;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        header = new Header(this.driver);
        PageFactory.initElements(driver, this);

    }
    //    public T openPage(Class<T> clazz) throws IOException {
//        T page = PageFactory.initElements(getDriver(), clazz);
//        getDriver().get(Configurations.URL + getPageUrl());
//        return page.get();
//    }
    public abstract String getPageUrl();

    public void open(String url) {
        driver.get(url);
    }


    public Header getHeader() {
        return header;
    }


    public String getAlertText() {
        waitCustomAlertDisplayed();
        return driver.switchTo().alert().getText();
    }


    @Override
    protected void load() {

    }
    @Override
    protected void isLoaded() throws IOException {
        waitForJQueryLoad();
        waitUntilJSReady();

    }
}