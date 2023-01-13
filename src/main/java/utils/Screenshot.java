package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import static driver.CustomDriver.getDriver;

public  class Screenshot  {

    public void getScreenshot() throws IOException {
        Date date = new Date();
        String screenshotFileName = date.toString().replace(" ", ".").replace(":", "-");
        TakesScreenshot scrShot =((TakesScreenshot)getDriver());
        File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(".//screenShot//" + screenshotFileName + ".png");
        FileUtils.copyFile(SourceFile, DestFile);
    }


}
