package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class EnterTextIntoDisabledTF extends BaseClass {
	
 public static void main(String[] args) throws Exception {
		driver.get("file:///C:/Users/user1/Desktop/disabledTb.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*for (int i=0;i<20;i++) {
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
		}
		for (int i=0;i<20;i++) {
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
		}*/
		WebElement t1= driver.findElement(By.id("t1"));
		WebElement t2= driver.findElement(By.id("t2"));
		//t1.sendKeys("admin");
		//t2.sendKeys("manager1");
		
		Thread.sleep(2000);
		 js.executeScript("document.getElementById('t1').value ='admin'");
		 Thread.sleep(2000);
		 //clear value
		 js.executeScript("document.getElementById('t2').value =''");
		 //enter manager in the disabled textbox
		 js.executeScript("document.getElementById('t2').value ='manager'");
		 //change second box to textbox to textbutton
		 js.executeScript("document.getElementById('t2').type='button'");
		 //driver.close();
	}

}
