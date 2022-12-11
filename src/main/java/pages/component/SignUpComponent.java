package pages.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpComponent {
    WebDriver driver;
    By userName = By.id("sign-username");
    By userPass =By.id("sign-password");
    By signUpButton =By.cssSelector("[onclick='register()']");

    public SignUpComponent(WebDriver driver) {
        this.driver = driver;
    }
    public void setTextUserName(String text){
        driver.findElement(userName).sendKeys(text);
    }

    public void setTextPassword(String text){
        driver.findElement(userPass).sendKeys(text);
    }
    public void clickSignUpButton(){
        driver.findElement(signUpButton).click();
    }
}