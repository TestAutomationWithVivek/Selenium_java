package com.parabank.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.parabank.pages.LoginPage;

public class ParaBankLoginTest {
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Eclips-SeleniumAutomation-Workspace\\\\drivers\\\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	
	@Test
	public void loginParaBank() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
