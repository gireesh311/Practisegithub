package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeLogin  extends BaseClass{

	public static void main(String[] args) throws Exception {
		driver.get("http://desktop-89emb6r/login.do");
		Thread.sleep(2000);
		WebElement unObj=driver.findElement(By.xpath("//input[@name='username']"));
		unObj.sendKeys("admin");
		Thread.sleep(2000);
		WebElement pwdObj=driver.findElement(By.xpath("//input[@type='password']"));
		pwdObj.sendKeys("manager1");
		Thread.sleep(2000);
		WebElement keepLoginObj=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		keepLoginObj.click();
		WebElement loginObj=driver.findElement(By.xpath("//a [@id='loginButton']"));
		loginObj.click();
		Thread.sleep(2000);
		driver.close();
	}

}
