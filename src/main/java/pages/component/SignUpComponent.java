package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpComponent {
    WebDriver driver;
    @FindBy(id = "sign-username")
    WebElement userName;
    @FindBy(id = "sign-password")
    WebElement userPass;
    @FindBy(css = "[onclick='register()']")
    WebElement signUpButton;

    public SignUpComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTextUserName(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(text);
    }

    public void setTextPassword(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(userPass));
        userPass.sendKeys(text);
    }

    public void clickSignUpButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();
    }
}