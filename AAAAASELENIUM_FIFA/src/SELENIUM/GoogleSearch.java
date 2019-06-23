package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearch extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.google.com");
		 WebElement SearchTB=driver.findElement(By.id("lst-ib"));
		 SearchTB.sendKeys("google");
		 Thread.sleep(2000);
		 WebElement ClickSearchTB=driver.findElement(By.xpath("//input[@ value='Google Search'] [@type='button']"));
		 ClickSearchTB.click();
	}

}
