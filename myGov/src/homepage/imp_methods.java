package homepage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.*;

import java.io.File;

public class imp_methods extends launch_config{
	ITestResult result;
	@Test
	public void getscreenshot(String methName, int count) throws Exception {
		
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("screens\\screenshot"+ result.getMethod().getMethodName() + "_" + count + ".png"));
    }
}
