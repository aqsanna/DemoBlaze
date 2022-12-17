package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
    @DataProvider(name ="data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"Value Passed"}};
    }


}
