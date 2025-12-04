package com.qa.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases {
	

public class login {
	@Test()
	public void m1() {
		Assert.assertEquals(false, true);
		System.out.println("this is m1 method is failed");
	}
	@Test()
	public void m2() {
		Assert.assertEquals(false, true);
		System.out.println("this is m2 method is failed");
	}

	@Test()
	public void m3() {
		Assert.assertEquals(true, true);
		System.out.println("this is m3  is passed");
	}
}


}
