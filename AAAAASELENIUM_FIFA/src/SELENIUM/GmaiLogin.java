package SELENIUM;

import org.openqa.selenium.By;

public class GmaiLogin extends BaseClass {

	public static void main(String[] args) throws Exception {
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sharoonrose");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='More ways to sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Enter your password']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("roja0912");
		driver.findElement(By.xpath("//span[text()='Next']")).click();	
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
