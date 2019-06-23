package SELENIUM;

import org.openqa.selenium.By;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws Exception {
		driver.get("http://demo.guru99.com/test/guru99home/");
		int x =driver.findElements(By.tagName("iframe")).size();
		System.out.println(" the no of frmes :"+x);
		Thread.sleep(2000);
		driver.switchTo().frame("a077aa5e");
		int y =driver.findElements(By.tagName("iframe")).size();
		System.out.println(" the no of frmes :"+y);
		driver.findElement(By.xpath("html/body/a/img")).click();
		Thread.sleep(2000);
	}

}
