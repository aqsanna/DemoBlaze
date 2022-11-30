import pages.SignUpPage;

public class SignUp {
    SignUpPage signUpPage = new SignUpPage();

    public void checkSignUp(){
        signUpPage.SignUpGeneral();
        if(signUpPage.getAlertText().equals("Sign up successful.")){
            System.out.println("Success sign up");
        }
        else {
            System.out.println("Sign up is failed");
        }

    }

}
