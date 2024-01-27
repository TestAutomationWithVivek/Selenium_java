/**
 * 
 */
package com.test.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.utilities.TakeScreenShot;

import seleniumPractise.OpenBrowser;

/**
 * @author user
 *
 */
public class ScreenShotOnFailedTestCase {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		String url = "https://www.google.co.in/";
		driver = OpenBrowser.startBrowser("chrome", url);
	}
	
	@Test
	public void test1() {
		driver.findElement(By.name("q")).sendKeys("indian army");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void testcase2() {
		Assert.assertEquals(true, true);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.FAILURE == result.getStatus()) {
			TakeScreenShot.screenShot(driver, result.getName());
		}
		
		driver.close();
	}

}
