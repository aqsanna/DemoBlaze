
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class FirstClassTestNg {

    @BeforeSuite
    public void beforSuit() {
        System.out.println("Test berforSuit");
    }

    @BeforeTest
    public void beforTest() {
        System.out.println("Test befortest");
    }

    @BeforeClass
    public void beforClass() {
        System.out.println("Test beforClass");
    }

    @BeforeMethod(onlyForGroups = "Oqs")
    public void beforMethod() {
        System.out.println("Oqs befortMethod");
    }

    @Test(priority = 1, dependsOnMethods = "a_test")
    public void c_test() {
        Assert.fail();
    }

    @Test(priority = 0, groups = "Oqs")
    public void b_test() {
        Assert.assertTrue(true);
    }

    @Test(priority = 10)
    public void a_test() {
        throw new SkipException("Skiping a tets");
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("Test aftertMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Test afterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Tets aftertest");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("Test afterSuit");
    }


}
