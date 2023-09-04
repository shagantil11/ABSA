package ListenersTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerCustom extends ScreenshotBase implements ITestListener
{

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Success Test");
		success(result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("FAILED Test");
		failed(result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Finish Test");
		onfinish(((ITestResult) context).getMethod().getMethodName());
		
	}
	
	
	

}
