package javascriptexecutoreg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clickonbuttonjs {
	public WebDriver driver;
	
	@Test
	public void clickonloginbuttonusingjs() {
		driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
        WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		//WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		//WebElement logbtn=driver.findElement(By.xpath("//button[@name='login']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='2pxsolidred';", username);
		js.executeScript("arguments[0].style.background='green';", username);
		
		//js.executeScript("document.getElementById('username').value='priyanka';");
//		js.executeScript("arguments[0].click();", logbtn);
//		js.executeScript("alert('login succ')");//using these genrate alertbox
//		js.executeScript("confirm()");//using these click on confirm btn
	}

}
