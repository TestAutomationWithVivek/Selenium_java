package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTestWithTestNgAssertionFeature {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Eclips-SeleniumAutomation-Workspace\\\\drivers\\\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googleTitleTest() {
		String tiltle = driver.getTitle();
		System.out.println(tiltle);
		System.out.println("google title test is excuting");
		
		Assert.assertEquals(tiltle, "Google123", "Title is not matched");
	}
	
	@Test
	public void googleLogoTest() {
		WebElement elementGoogleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		System.out.println(elementGoogleLogo.getText());
		System.out.println(elementGoogleLogo.isDisplayed());
		System.out.println("google togo test excuting");
		Assert.assertEquals(elementGoogleLogo.isDisplayed(), true);
		Assert.assertTrue(elementGoogleLogo.isDisplayed());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
