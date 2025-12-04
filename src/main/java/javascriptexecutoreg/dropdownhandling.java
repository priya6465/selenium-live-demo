package javascriptexecutoreg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownhandling {
	
	public WebDriver driver;
	@Test
	public void dropdownhandlingdemo()  {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0.500);");
		
		WebElement oldersettle=driver.findElement(By.id("drop1"));
		Select sel=new Select(oldersettle);
		List<WebElement>dropval=sel.getOptions();
		System.out.println("dropdown size is:"+dropval.size());
		for(int i=0;i<dropval.size();i++) {
			String droptext=dropval.get(i).getText();
			System.out.println("value is:"+droptext);
		
			if(droptext.equals("doc 1")) {
				dropval.get(i).click();
				break;
			}
		}
			WebElement selectoption=sel.getFirstSelectedOption();
			String seltext=selectoption.getText();
			if(seltext.equals("doc 1")) {
				System.out.println("dropdown select val");
			}
			else
			{
				System.out.println("dropdown select not value");
			}
	}
}