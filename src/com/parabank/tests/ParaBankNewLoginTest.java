package com.parabank.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.pages.NewLoginPageParaBank;
import com.parabank.utilities.Helper;

public class ParaBankNewLoginTest extends Helper {
	NewLoginPageParaBank newLoginPageParaBank = null;
	public ParaBankNewLoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		startBrowser("chrome");
	}
	
	@Test
	public void loginParaBank() {
		newLoginPageParaBank = new NewLoginPageParaBank(driver);
		newLoginPageParaBank.loginParaBank();
	}
	
	//@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
