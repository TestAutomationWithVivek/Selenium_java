package com.test;

import org.testng.annotations.Test;

public class TestNgDependsOnMethodFeature {
	
	@Test
	public void loginTest() {
		System.out.println("login Test");
		//int a = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void getToHomePage() {
		System.out.println("Get to home page");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void getToRegistrationPage() {
		System.out.println("get to registration page");
	}

}
