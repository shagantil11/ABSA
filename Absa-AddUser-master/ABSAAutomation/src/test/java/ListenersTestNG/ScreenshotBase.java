package ListenersTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestBaseLayer.TestBase;

public class ScreenshotBase extends TestBase
{
	
	public static void failed(String un)
	{
	
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(scrFile, new File("D:/New folder6/QAAssesment/ScreenshotsFail/"+un+"-"+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		

	}
	
	public static void success(String un1)
	{
	
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(scrFile, new File("D:/New folder6/QAAssesment/SuccessScreenShots/"+un1+"-"+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		

	}
	
	public static void onfinish(String un2)
	{
	
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    try {
				FileUtils.copyFile(scrFile, new File("D:/New folder6/QAAssesment/Onfinish/"+un2+"-"+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	
	

}
