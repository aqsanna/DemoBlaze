import org.openqa.selenium.WebDriver;
import pages.SignUpPage;

public class SignUp {
    WebDriver driver;
    SignUpPage signUpPage = new SignUpPage(driver);

    public void checkSignUp() throws InterruptedException {
        signUpPage.signUpSuccess();
        if(signUpPage.getAlertText().equals("Sign up successful.")){
            System.out.println("Success sign up");
        }
        else {
            System.out.println("Sign up is failed");
        }
        signUpPage.PageClose();
    }

    public void checkEmptySignUp() throws InterruptedException {
        signUpPage.signUpEmpty();
        if(signUpPage.getAlertText().equals("Please fill out Username and Password.")){
            System.out.println("Username and password required fields");
        }
        else{
            System.out.println("Username and password not required fields");
        }
        signUpPage.PageClose();
    }

    public void checkExistingInfoSignUp() throws InterruptedException {
        signUpPage.signUpExistingInfo();
        if(signUpPage.getAlertText().equals("This user already exist.")){
            System.out.println("This user already exist.");
        }
        else{
            System.out.println("This user not exist.");
        }
        signUpPage.PageClose();

    }

}
