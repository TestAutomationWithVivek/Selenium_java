package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListenerToTakeScreenShotOfFailedTestCases.class)
public class TestNgFailureTestCasesScreenshotUsingListner extends BaseClassForTakingFailedTestCase{
	
	@BeforeMethod
	public void setUp() {
		setUpBrowser();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void takeScreenshot() {
		// thiss method is made failed delibratly
		Assert.assertEquals(true, false);
	}

}
