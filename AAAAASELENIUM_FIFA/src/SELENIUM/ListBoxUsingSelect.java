package SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBoxUsingSelect extends BaseClass {

	public static void main(String[] args) throws Exception {
	//print all the option present in the listbox
		driver.get("file:///C:/Users/user1/Desktop/listbox.html");
		WebElement listBoxObj =driver.findElement(By.id("mtr"));
		Select s= new Select(listBoxObj);
		List<WebElement> allOptions = s.getOptions();
		System.out.println("total numbr of options :"+allOptions.size());
		for (WebElement options : allOptions) {
			String text = options.getText();
			System.out.println(text);
		}
		//select idly
		s.selectByIndex(0);
		Thread.sleep(2000);
		//select vada 
		s.selectByValue("v");
		Thread.sleep(2000);
		//select dosa
		s.deselectByVisibleText("DOSA");
		Thread.sleep(2000);
		// PRINT LIST OF SELECTED ELEMENTS
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("selected number of options :"+allSelectedOptions.size());
		for (WebElement selectedOptions : allSelectedOptions) {
			String selectedText =selectedOptions.getText();
			System.out.println(selectedText);	
		}
		// print the first selected option
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("first selected option is  :"+ firstSelectedOption.getText());
		//deselect IDLY
		s.deselectByIndex(0);
		Thread.sleep(2000);
		System.out.println("first selected option is  :"+ firstSelectedOption.getText());
		WebElement firstSelectedOption1 = s.getFirstSelectedOption();//first get and then print
		System.out.println("first selected option is  :"+ firstSelectedOption1.getText());
		s.deselectByValue("v");
		Thread.sleep(2000);
		s.deselectByVisibleText("Poori");
		Thread.sleep(2000);
		// verify the listbox is multiple or single select
		boolean multi =s.isMultiple();
		if(multi){			
			System.out.println("listbox is multiple");
		}
		else{
			System.out.println("listbox is single");
		}
		driver.close();
	}

}
