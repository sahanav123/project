package Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Resource.Base;

public class Listeners extends Base implements ITestListener {
	public WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution successfull");
		 driver = null;

		String testname = result.getName();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			takeScreenshot(testname, driver);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		 driver = null;

		String testresult = result.getName();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			takeScreenshot(testresult, driver);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution Finished");
	}

}
