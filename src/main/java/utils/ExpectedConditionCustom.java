package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import pages.basePage.header.BasePage;
import pages.component.Header;

public class ExpectedConditionCustom extends BasePage {


    public ExpectedConditionCustom(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageUrl() {
        return null;
    }

    public static ExpectedCondition<Boolean> alertDisplayed() {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return driver.switchTo().alert().getText().contains(" ");
                } catch (NoSuchSessionException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        };
    }

    public static  ExpectedCondition<Boolean> customVisibleOf(WebElement element){
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
               try{
                  return (element!=null && element.isDisplayed());
               }catch (Exception e){
                   e.printStackTrace();
                   return  false;
               }
            }
        };
    }
    public static ExpectedCondition<Boolean> customInVisibleOf(WebElement element){
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
               try{
                   return (!element.isDisplayed());
               }catch(Exception e){
                   e.printStackTrace();
                   return false;
               }
            }
        };
    }
    public static  ExpectedCondition<Boolean> customClickable(WebElement element){
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try{
                    return (element!=null && element.isEnabled());
                }catch(Exception e){
                    e.printStackTrace();
                    return  false;
                }
            }
        };
    }
}
