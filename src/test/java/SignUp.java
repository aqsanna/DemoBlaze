import org.openqa.selenium.WebDriver;
import pages.SignUpPage;

public class SignUp {
    WebDriver driver;
    SignUpPage signUpPage = new SignUpPage(driver);

    public void checkSignUp() throws InterruptedException {
        signUpPage.SignUpGeneral();
        if(signUpPage.getAlertText().equals("Sign up successful.")){
            System.out.println("Success sign up");
        }
        else {
            System.out.println("Sign up is failed");
        }

    }

}
