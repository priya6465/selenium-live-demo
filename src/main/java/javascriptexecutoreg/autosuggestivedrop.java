package javascriptexecutoreg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class autosuggestivedrop {

	public WebDriver driver;
	@Test
	public void autosuggestivedrophandlind() throws InterruptedException  {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shoes");
		Thread.sleep(5000);
		
List<WebElement>searchsuggestion=driver.findElements(By.xpath("//ul[@class='col-12-12 I01Bvi O1jfZ8']//li"));
for(int i=0;i<searchsuggestion.size()-1;i++) {
	String text=searchsuggestion.get(i).getText();
	System.out.println(text);
	if(text.equals("shoes for men")) {
		searchsuggestion.get(i).click();
		break;
	}
	
//if(searchsuggestion.get(i).getText().contains("shoes for men")) {
//	searchsuggestion.get(i).click();
}
	
	
}


}