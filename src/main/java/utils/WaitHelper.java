package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static driver.CustomDriver.getDriver;
import static utils.ExpectedConditionCustom.*;

public class WaitHelper {
    public static final int TIME_OUT = 10;
    static  WebDriverWait wait;

    static {
            wait = new WebDriverWait(getDriver(), Duration.ofSeconds(TIME_OUT));
    }

    public static void waitVisibleElement(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT)).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitCustomVisibleOf(WebElement element){
        wait.until(customVisibleOf(element));
    }


    public static void waitInVisibleElement(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT)).until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitCustomInVisible(WebElement element){
        wait.until(customInVisibleOf(element));
    }

    public static void waitAlertIsPresent(WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT)).until(ExpectedConditions.alertIsPresent());
    }

    public static void waitElementToBeClickable(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT)).until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitCustomClickable(WebElement element){
        wait.until(customClickable(element));
    }

    public static void waitCustomAlertDisplayed(){
        wait.until(alertDisplayed());

    }

}
