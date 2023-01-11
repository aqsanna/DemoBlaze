package listener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext ;
import org.testng.ITestListener ;
import org.testng.ITestResult ;

public class ListenerTest implements ITestListener
{
    private static final Logger logger = LogManager.getLogger(ListenerTest.class);

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        logger.info("onStart method started");

    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        logger.info("onFinish method started");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        logger.info("onTestFailedButWithinSuccessPercentage" +result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        logger.info("onTestFailure Method" +result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        logger.info("onTestSkipped Method" +result.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        logger.info("On Test Started" +result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        logger.info("onTestSuccess Method" +result.getName());

    }
}