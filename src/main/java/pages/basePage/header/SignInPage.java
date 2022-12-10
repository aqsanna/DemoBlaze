package pages.basePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.component.SignInComponent;

public class SignInPage extends HomePageH {
    public WebElement logIn;
    SignInComponent signInComponent = new SignInComponent(driver);

    public SignInPage(WebDriver driver) {
        super(driver);
        logIn = driver.findElement(By.id("login2"));
    }

    public void signInSuccess() throws InterruptedException {
        logIn.click();
        Thread.sleep(1000);
        signInComponent.userName.sendKeys("Oqsannatest");
        signInComponent.password.sendKeys("test123");
        signInComponent.signInButton.click();
        Thread.sleep(3000);
    }
    public void signInEmpty() throws InterruptedException {
        logIn.click();
        Thread.sleep(1000);
        signInComponent.signInButton.click();
        Thread.sleep(3000);
    }

    public void NonExistingUser() throws InterruptedException {

        logIn.click();
        Thread.sleep(1000);
        signInComponent.userName.sendKeys("asdadasdaa");
        signInComponent.password.sendKeys("test123");
        signInComponent.signInButton.click();
        Thread.sleep(2000);

    }

}
