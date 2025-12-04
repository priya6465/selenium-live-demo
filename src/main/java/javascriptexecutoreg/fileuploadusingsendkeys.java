package javascriptexecutoreg;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fileuploadusingsendkeys {
	public WebDriver driver;
	@Test
	public void fileupload() throws AWTException, InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/FileUpload.html");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500);");
	
	WebElement fileuploadelement=driver.findElement(By.xpath("//input[@type='file']"));
	
	Actions act=new Actions(driver);
	act.click(fileuploadelement).perform();
	
	fileuploadelement.sendKeys("C:\\Users\\FCI\\Desktop\\priya.txt");
	Thread.sleep(2000);
//    Assert.assertTrue(filename.isDisplayed());
//    Assert.assertEquals(filename.getText(), "priya.txt (NaN undefined)");  
	WebElement fileelement = driver.findElement(By.xpath("//div[text()='priya.txt']//following-sibling::br"));

    String filename=fileelement.getText();
	if(filename.equals("priya.txt")) {
		System.out.println("file upload successfull");
	}
	else
	{
		System.out.println("file upload not successfull");
	}
	
	}
	
	
}