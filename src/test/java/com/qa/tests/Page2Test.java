package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Page2Test {

	public WebDriver driver;
	@Test
	public void Test3() {
		System.out.println("executed test 3 method in firefox");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void Test4() {
		System.out.println("executed test 4 method");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
}
