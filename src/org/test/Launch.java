package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Launch {
	@Test(retryAnalyzer =Execute.class)
	private void test1() {
		Assert.assertTrue(false);
	

	}
	@Test
	private void test4() {
		Assert.assertTrue(true);
	

	}
	@Test
	private void test3() {
		Assert.assertTrue(false);

	}
	@Test
	private void test5() {
		Assert.assertTrue(false);

	}
	@Test
	private void test2() {
		Assert.assertTrue(true);

	}
	
	

}
