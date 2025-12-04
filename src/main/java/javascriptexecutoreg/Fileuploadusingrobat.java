package javascriptexecutoreg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Fileuploadusingrobat {

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
	//String filepath="C:\Users\FCI\Desktop\priya.txt";
	StringSelection sel=new StringSelection("C:\\Users\\FCI\\Desktop\\priya.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		Thread.sleep(5000);
		Robot rob=new Robot();	

		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
	
	}
	}

