package com.qa.tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Dependsonmethodeg {
	@Test()
	public void logintest() {
		throw new SkipException("skip");
		//System.out.println("login test method");
		}
	
	@Test(dependsOnMethods="logintest",alwaysRun=true)
	public void Dashboard() {
		System.out.println("Dashboard test method");
	}
}
