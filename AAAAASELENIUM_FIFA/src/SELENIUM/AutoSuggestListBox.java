package SELENIUM;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestListBox  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.google.co.in/");
		WebElement searchBox= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchBox.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		int count=options.size();
		System.out.println(" the no of suggestions are:"+ count);
		String expectedValue="selenium interview questions";
		//print all the auto suggestion values
		
		
		for(WebElement option:options) {
			String  text =option.getText();
				System.out.println(" "+text);
				
			}
		for(WebElement option:options) {
			String  text =option.getText();
				
				if(text.equalsIgnoreCase(expectedValue)) {
					option.click();
					break;
				}
			}
		driver.close();
	}
}


