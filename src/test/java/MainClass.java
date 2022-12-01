public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        SignUp signUp = new SignUp();
        //signUp.checkSignUp();
        //signUp.checkEmptySignUp();
        //signUp.checkExistingInfoSignUp();
        SignIn signIn = new SignIn();
        //signIn.checkEmptySignIn();
        signIn.checkNonExistingUser();

    }
}
