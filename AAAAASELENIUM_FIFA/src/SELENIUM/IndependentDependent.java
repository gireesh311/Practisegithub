package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class IndependentDependent extends BaseClass {

	public static void main(String[] args) {
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]"));
	}

}
