package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Eclips-SeleniumAutomation-Workspace\\\\drivers\\\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 2, groups = "Title")
	public void googleTitleTest() {
		String tiltle = driver.getTitle();
		System.out.println(tiltle);
		System.out.println("google title test is excuting");
	}
	
	@Test(priority = 1, groups = "Logo")
	public void googleLogoTest() {
		WebElement elementGoogleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		System.out.println(elementGoogleLogo.getText());
		System.out.println(elementGoogleLogo.isDisplayed());
		System.out.println("google togo test excuting");
	}
	
	@Test(priority = 0, groups = "GmailLink")
	public void verifyGmailLink() {
		WebElement elementMailLink = driver.findElement(By.linkText("Gmail"));
		System.out.println(elementMailLink.isDisplayed());
		System.out.println("verify gmail link test excuting");
	}
	
	@Test(priority = 3, groups = "test1")
	public void test1() {
		System.out.println("Test1 us excuting");
	}
	
	@Test(priority = 4, groups = "test2")
	public void test2() {
		System.out.println("Test2 is excuting");
	}
	
	@Test(priority = 5, groups = "test3")
	public void test3() {
		System.out.println("Test3 is excuting");
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		System.out.println("tear down test suppose to close browser");
	}

}
