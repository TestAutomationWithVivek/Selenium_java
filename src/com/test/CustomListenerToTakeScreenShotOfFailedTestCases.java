package com.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListenerToTakeScreenShotOfFailedTestCases extends BaseClassForTakingFailedTestCase implements ITestListener {
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test cases");
		failedMethod();
	}

}
