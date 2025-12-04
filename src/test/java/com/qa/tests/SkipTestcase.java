package com.qa.tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestcase {

	//@Test(enabled=false)
	@Test
	public void m1() {
		//System.out.println("m1 method");
		throw new SkipException("skip method");
		}
	
	@Test
	public void m2() {
		System.out.println("m2 method");
	}
}
