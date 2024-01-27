package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	 
	
	@BeforeSuite
	public void setUpBrowser() {
		System.out.println("@BeforeSuite---Set up system property for chrome browser");
	}
	
	//Pre-condition annotations----- starting with "@Before"
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@@BeforeTest---launch chrome browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass---log in an app");
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("@BeforeMethod---enter url");
	}
	
	
	
	//Test case --- starting with "@TEst"
	@Test
	public void googleTitleTest() {
		System.out.println("@Test-----get title of gooogle");
	}
	
	@Test
	public void nameOfTheSite() {
		System.out.println("@Test--------- print the name of the browser");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("@AfterMethod---log out from an app");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass---close the browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest-----Delete all cookies");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite----Generate test report");
	}

}
