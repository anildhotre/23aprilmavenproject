package listeners;

import java.io.IOException;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testcase.BaseTest;
import utility.New_screen;

public class TestNGListener22 extends BaseTest implements ITestListener 
{
	ExtentReports extent = ExtentReportGen.extentReportGenerator();
    public static ExtentTest test ;
	@Override
	public void onTestStart(ITestResult result) {
	
	System.out.println("Test case :"+result.getMethod().getMethodName()+" has been  started");
	test = extent.createTest(result.getName());
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("Test case :"+result.getMethod().getMethodName()+" has been  passed");	
	test.log(Status.PASS, "Test case is passed");
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("Test case :"+result.getMethod().getMethodName()+" has been  failed");	

	try {
		New_screen.CaptureScreenShotwithpath(driver, result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(New_screen.CaptureScreenShotwithpath(driver, result.getName()));
	} 
	catch (IOException e)
	{
		System.out.println("Exception arrived catch is executing");
	}

}

@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("Test case :"+result.getMethod().getMethodName()+" has been  skipped");	
	test.log(Status.SKIP, "Test case got skipped");
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

}

@Override
public void onTestFailedWithTimeout(ITestResult result) {
	
}

@Override
public void onStart(ITestContext context) {
System.out.println("Test tag "+context.getName()+" has been started");		
}

@Override
public void onFinish(ITestContext context) {
	System.out.println("Test tag "+context.getName()+" has been finished");		
	extent.flush();
}



}