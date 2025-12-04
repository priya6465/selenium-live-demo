package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTest1 {
	
public WebDriver driver;
	@Test
	public void Test1() {
		System.out.println("executed test 1 method");
        driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		String Title=driver.getTitle();
		if(Title.equals("Google")) {
			System.out.println("title is matched");
		}
		else {
			System.out.println("Title is not Matched");
		}
	}
	
      @Test
      public void Test2() {
  		System.out.println("executed test 2 method");
    	  driver=new ChromeDriver();
    	  driver.get("https://www.facebook.com/");

}}