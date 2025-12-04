package javascriptexecutoreg;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkartautomate {
	public WebDriver driver;
	@Test
	public void selectmobil() throws InterruptedException  {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("iphone 15 pro max");
		searchbox.submit();
		String parentwindowid=driver.getWindowHandle();
		System.out.println(parentwindowid);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 Pro Max (Desert Titanium, 256 GB)']")).click();
  Set<String>allwindow=driver.getWindowHandles();	
 Iterator<String> it= allwindow.iterator();
 while(it.hasNext()) {
	String childwindowid= it.next();
 
 if(!parentwindowid.equals(childwindowid)) {
	 driver.switchTo().window(childwindowid);
	 break;
 }
 }	
System.out.println( driver.getCurrentUrl()); 
List<WebElement>products=driver.findElements(By.xpath("//div[@class='jwbTM1']//ul//li"));
System.out.println(products.size());
for(WebElement product:products) {
System.out.println(product.getText());

}

driver.switchTo().window(parentwindowid);
System.out.println(driver.getCurrentUrl());

}
}

	