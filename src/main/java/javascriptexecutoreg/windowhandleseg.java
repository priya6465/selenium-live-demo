package javascriptexecutoreg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowhandleseg {

	public WebDriver driver;
	@Test
	public void handlemultiplewindow()  {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	String parentwindowid=driver.getWindowHandle();
	System.out.println(parentwindowid);
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	driver.findElement(By.xpath("//a[@id='selenium143']")).click();

	Set<String>allwindow=driver.getWindowHandles();
	Iterator<String>it=allwindow.iterator();
	while(it.hasNext()) {
		String childwindowid=it.next();
		if(!parentwindowid.equals(childwindowid)) {
			driver.switchTo().window(childwindowid);
			System.out.println("ChildWindowTitle is:"+driver.getTitle());
			driver.close();
			driver.switchTo().window(parentwindowid);
			System.out.println("ParentWindowTitle is:"+driver.getTitle());
			      }}
	 driver.quit();
	
	

//		allwindow=driver.getWindowHandles();
//		while(it.hasNext()) {
//			String grandchildwindowid=it.next();
//			if(!parentwindowid.equals(grandchildwindowid)) {
//				driver.switchTo().window(grandchildwindowid);
//				System.out.println("grandchildwindowid is"+driver.getTitle());
//			}
//		}

		}}	


			
			
		
	
	
	
	
	