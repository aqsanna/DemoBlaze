package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPage {

    String url= "https://www.demoblaze.com/index.html";
    private WebElement signUp = getDriver().findElement(By.id("signin2"));
    private WebElement userName =getDriver().findElement(By.id("sign-username"));
    private WebElement userPass = getDriver().findElement(By.id("sign-password"));
    private WebElement signUpButton = getDriver().findElement(By.cssSelector("[onclick='register()']"));

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return  driver;
    }

    public void SignUpGeneral(){

        getDriver().get(url);
        getDriver().manage().window().maximize();
        signUp.click();
        userName.sendKeys("Oqsannatest");
        userPass.sendKeys("test123");
        signUpButton.click();
    }

    public String getAlertText(){
        return getDriver().switchTo().alert().getText();
    }


}
