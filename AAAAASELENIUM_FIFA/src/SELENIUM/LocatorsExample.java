package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://desktop-89emb6r/login.do");
		WebElement unTb=driver.findElement(By.className("textfield"));
		unTb.clear();
		Thread.sleep(2000);
		unTb.sendKeys("admin");
		WebElement passTb=driver.findElement(By.name("pwd"));
		passTb.clear();
		Thread.sleep(2000);
		passTb.sendKeys("manager1");
		WebElement licb=driver.findElement(By.id("keepLoggedInLabel"));
		licb.click();
		Thread.sleep(2000);
		WebElement logIn=driver.findElement(By.linkText("Login"));
		logIn.click();
		Thread.sleep(3000);
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		Thread.sleep(3000);
		logOut.click();
		//WebElement logIn1=driver.findElement(By.id("loginButton"));
		//Thread.sleep(2000);
		//logIn1.click();
		
		

	}

}
