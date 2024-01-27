package com.test;

import org.testng.annotations.Test;

public class TestNgExceptionFeature {
	@Test
	public void demoMethod() {
		String s = "100A";
		int a = Integer.parseInt(s);
	}

}
