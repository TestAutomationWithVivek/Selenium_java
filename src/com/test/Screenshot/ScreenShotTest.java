/**
 * 
 */
package com.test.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.utilities.Helper;
import com.parabank.utilities.TakeScreenShot;

import seleniumPractise.OpenBrowser;

/**
 * @author user
 *
 */
public class ScreenShotTest{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		String url = "https://www.google.co.in/";
		driver = OpenBrowser.startBrowser("chrome", url);
	}
	
	@Test
	public void test1() {
		driver.findElement(By.name("q")).sendKeys("indian army");
		TakeScreenShot.screenShot(driver, "abc");
	}
	

}
