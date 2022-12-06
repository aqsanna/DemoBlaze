import org.testng.ITestContext;
import org.testng.annotations.*;

@Test(groups = "myGroup")
public class InheritGroups {

    @BeforeSuite
    public void function1() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void function2() {
        System.out.println("BeforeTest");
    }

    @BeforeGroups(inheritGroups = true)
    public void function3() {
        System.out.println("BeforeGroups");
    }

    @BeforeGroups(groups = { "myGroup" })
    public void beforeGroupsNoGroup(ITestContext tc) {
        System.out.println("I am @BeforeGroups");
        tc.setAttribute("Method", "Method");
    }

    @BeforeClass(inheritGroups = true)
    public void function4() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod(inheritGroups = true)
    public void function5() {
        System.out.println("BeforeMethod");
    }

    @Test
    public void function6(ITestContext tc) {
        System.out.println("Test " + tc.getAttribute("Method"));
    }

    @AfterSuite(inheritGroups = true)
    public void function11() {
        System.out.println("AfterSuite");
    }

    @AfterTest(inheritGroups = true)
    public void function21() {
        System.out.println("AfterTest");
    }

    @AfterGroups(inheritGroups = true)
    public void function31() {
        System.out.println("AfterGroups");
    }

    @AfterClass(inheritGroups = true)
    public void function41() {
        System.out.println("AfterClass");
    }

    @AfterMethod(inheritGroups = true)
    public void function51() {
        System.out.println("AfterMethod");
    }
}
