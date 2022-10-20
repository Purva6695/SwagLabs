package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends CommonElements implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is successful" + result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		try {
			Screenshot.ss(driver, result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Test is fail" + result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test is skipped" + result.getName());
	}
	
	public void onStart(ITestResult result)
	{
		System.out.println("Test is started" + result.getName());
	}

}
