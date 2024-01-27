package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgHardAssertVsSoftAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test1() {
		System.out.println("Open the browser");
		Assert.assertEquals(true, true);
		
		System.out.println("Login into browser");
		System.out.println("Enter user name");
		System.out.println("Enter password");
		System.out.println("Click on sign in button");
		Assert.assertEquals(true, true);
		
		System.out.println("Verify Home page");
		softAssert.assertEquals(false, true);
		
		System.out.println("Check logo of account page");
		softAssert.assertEquals(false, true);
		
		System.out.println("Navigate to referral page");
		softAssert.assertEquals(false, true);
		
		softAssert.assertAll();
	}

}
