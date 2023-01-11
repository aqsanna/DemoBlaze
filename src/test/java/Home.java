import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.Log4J2LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.basePage.header.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Home extends BaseTest{

    HomePage homePage;
  //  private static  final InternalLoggerFactory log = (InternalLoggerFactory) Log4J2LoggerFactory.getInstance(Home.class);
  private static final Logger logger = LogManager.getLogger(Home.class);
    @Test
    public void checkOpenHomePage() throws InterruptedException, IOException {

        homePage = new HomePage(driver);
        homePage.get();
        homePage.openHome();
        Assert.assertTrue(homePage.isBannerDisplayed(),"Home page is not opening");
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");

    }
}
