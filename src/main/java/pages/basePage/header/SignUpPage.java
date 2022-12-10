package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.component.SignUpComponent;

public class SignUpPage extends HomePageH {
    public WebElement signUp;
    SignUpComponent signUpComponent = new SignUpComponent(driver);

    public SignUpPage(WebDriver driver) {
        super(driver);
        signUp =driver.findElement(By.id("signin2"));
    }
    public void signUpSuccess() throws InterruptedException {
        signUp.click();
        Thread.sleep(2000);
        signUpComponent.userName.sendKeys("Oqsannatest007812202222");
        signUpComponent.userPass.sendKeys("test123");
        signUpComponent.signUpButton.click();
        Thread.sleep(2000);
    }
    public void signUpEmpty() throws InterruptedException {
        signUp.click();
        Thread.sleep(2000);
        signUpComponent.signUpButton.click();
        Thread.sleep(2000);
    }

    public void signUpExistingInfo() throws InterruptedException {
        signUpSuccess();
    }
}
