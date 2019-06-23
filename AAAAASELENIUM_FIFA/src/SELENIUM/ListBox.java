package SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListBox extends BaseClass {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/user1/Desktop/listbox.html");
		//List<WebElement> allOptions=driver.findElements(By.id("mtr"));
		//prints size of listbox with id mtr
		//System.out.println("size of listbox  :"+allOptions.size());
		// 
		List<WebElement> allOptions=driver.findElements(By.xpath("//select[@id='mtr']//option"));
		System.out.println("size of listbox  :"+allOptions.size());
		for (WebElement option : allOptions) 
		{
			String foodItem =option.getText();
			if(foodItem.equals("DOSA"))
			{
				option.click();
			}
		}
	}

}
