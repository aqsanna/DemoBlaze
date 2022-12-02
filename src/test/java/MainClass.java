public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        SignUp signUp = new SignUp();
        //signUp.checkSignUp();
        //signUp.checkEmptySignUp();
        //signUp.checkExistingInfoSignUp();
        SignIn signIn = new SignIn();
        //signIn.checkEmptySignIn();
        //signIn.checkNonExistingUser();
        Cart cart = new Cart();
        //cart.checkOpenCart();
        AboutUs aboutUs = new AboutUs();
        //aboutUs.checkOpenAboutUs();
        Contact contact= new Contact();
        //contact.checkContact();
        Home home = new Home();
        home.checkOpenHomePage();

    }
}
