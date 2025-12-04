package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Page1Test {
	
public WebDriver driver;
	@Test
	public void Test1() {
		System.out.println("executed test 1 method in chrome");
        driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
	}
      @Test
      public void Test2() {
  		System.out.println("executed test 2 method");
    	  driver=new ChromeDriver();
    	  driver.get("https://www.facebook.com/");

}}