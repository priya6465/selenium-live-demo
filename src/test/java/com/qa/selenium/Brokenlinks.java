package com.qa.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Brokenlinks {

	@Test
	public void findbrokenlinks() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links"+links.size());
		for(int i=0;i<links.size();i++) {
			String linkurl=links.get(i).getAttribute("href");
			URL url=new URL(linkurl);//pass the string which having hrep prop
		HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
		httpcon.connect();
		int Responsecode=httpcon.getResponseCode();
		
		if(Responsecode>=400) {
			System.out.println("these are broken links");
		}
		else
		{
			System.out.println("these are valid links");
		}
			
			
		}
		
		
	}
}
