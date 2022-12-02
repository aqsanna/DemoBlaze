import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class Home {
    WebDriver driver;
    HomePage homePage = new HomePage(driver);
    public void checkOpenHomePage(){
        if(homePage.isDisplayed()){
            System.out.println("Home page is open");
        }
        else{
            System.out.println("Home page is not opening");
        }
        homePage.pageClose();
    }
}
