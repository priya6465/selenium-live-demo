package javascriptexecutoreg;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtablehandling {
	public WebDriver driver;
	@Test
	public void counttableheading() {
	driver=new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	driver.manage().window().maximize();
	List<WebElement>alldata=driver.findElements(By.xpath("//table[@id='countries']//tr//td"));
	System.out.println(alldata.size());
	//WebElement ch=driver.findElement(By.xpath("//strong[text()='Algeria']//parent::td//preceding-sibling::td//input[@class='hasVisited']"));
	WebElement ch=driver.findElement(By.xpath("//table[@id='countries']//strong[text()='Algeria']//parent::td//preceding-sibling::td//input[@class='hasVisited']"));
	ch.click();
	String value=ch.getText();
	if(value.equals("Algeria")) {
		System.out.println("checkbox value is selected right");
	}
	else
	{
		System.out.println("checkbox value is not selected ");
	}
			
//	Boolean selch=ch.isSelected();
//	System.out.println("checkbox is selected:"+selch);


	
//	
//	
//	for(int i=0;i<alldata.size();i++) {
//		String value=alldata.get(i).getText();
//		System.out.println(value);
//		if(value.equals("Country")) {
//			alldata.get(i);
//			break;
		}
	}
	

