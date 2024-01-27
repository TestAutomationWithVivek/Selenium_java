package com.test;

import org.testng.annotations.Test;

public class TestNgInnvocationCountFeature {
	
	@Test(invocationCount = 10)
	public void additionProgram() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println("------------------------------------");
	}

}
