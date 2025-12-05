package com.qa.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {

	public WebDriver driver;
     @Test
	public void capturescreenshot() throws IOException {
		// driver=new FirefoxDriver();
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(file, new File(./FailedScreenshot)+.png);	
	FileUtils.copyFile(file, new File("failedtest"));
	driver.close();
	}
}
