package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryLogicFeature {
	
	@Test
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, true);
	}
	
	/*
	 * @Test(retryAnalyzer = Analyser.RetryAnalyser.class) public void test1() {
	 * Assert.assertEquals(false, true); }
	 * 
	 * @Test public void test2() { Assert.assertEquals(false, true); }
	 */

}
