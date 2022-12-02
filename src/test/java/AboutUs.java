import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;

public class AboutUs {
    WebDriver driver;
    AboutUsPage aboutUsPage = new AboutUsPage(driver);

    public void checkOpenAboutUs() throws InterruptedException {
        aboutUsPage.openAboutUs();
        if(aboutUsPage.isDisplayed().equals(true)){
            System.out.println("The About Us page is open and the video is turned on");
        }
        else{
        System.out.println("The About page doesn't open or the video can't be played");
        }

        aboutUsPage.pageClose();
    }
}
