package listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class TestNG {

    @Test  //Success Test
    public void CloseBrowser() {

        Assert.assertTrue(true);
    }

    @Test //Failed Test
    public void OpenBrowser() {
        String expectedTitle = "Free QA Automation Tools For Everyone";
        Assert.assertEquals("originalTitle", expectedTitle, "Titles of the website do not match");
    }
    private static int i = 1;

    @Test (successPercentage = 90, invocationCount = 3) //Failing Within Success
    public void AccountTest() {
        System.out.println(i);
        Assert.assertEquals(1 , i);
        i++;
    }

    @Test  // Skip Test
    public void SkipTest() {
        throw new SkipException("Skipping The Test Method ");
    }
}