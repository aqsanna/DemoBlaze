
import org.testng.Assert;
import org.testng.annotations.Test;

public class DepenOnClassTestNg {


    @Test(priority = 1)
    public void c_test() {
        Assert.assertNotEquals(5, 4, "text1");

    }

    @Test(groups = "aaa")
    public void b_test() {
        Assert.assertTrue(true);
    }

    @Test(dependsOnGroups ="aaa" )
    public void a_test() {

    }
    @Test(description = "barev", groups = "aaa")
    public void d_test(){

    }


}
