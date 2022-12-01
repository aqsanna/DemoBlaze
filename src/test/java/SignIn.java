import org.openqa.selenium.WebDriver;
import pages.SignInPage;
import pages.SignUpPage;

public class SignIn {
    WebDriver driver;
    SignInPage signInPage = new SignInPage(driver);

    public void checkSignIn() throws InterruptedException {
        signInPage.signInSuccess();
        if(signInPage.isDisplayed().equals(true)){
            System.out.println("Your login was successful");
        }
        else{
            System.out.println("You can't log in this credential");
        }
        signInPage.PageClose();
    }

    public void checkEmptySignIn() throws InterruptedException {
        signInPage.signInEmpty();
        if(signInPage.getAlertText().equals("Please fill out Username and Password.")){
            System.out.println("Username and password required fields");
        }
        else{
            System.out.println("Username and password not required fields");
        }
        signInPage.PageClose();
    }

    public void checkNonExistingUser() throws InterruptedException {
        signInPage.NonExistingUser();
        if(signInPage.getAlertText().equals("User does not exist.")){
            System.out.println("This user not exist.");
        }
        else{
            System.out.println("Success sign in");
        }
        signInPage.PageClose();
    }
}
