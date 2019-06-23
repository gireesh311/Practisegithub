package SELENIUM;

import org.openqa.selenium.WebDriver.Navigation;

public class Testing2 extends BaseClass {

	public static void main(String[] args) {
		driver.navigate().to("https://www.google.co.in");
		driver.navigate().to("http://desktop-89emb6r/login.do");
		driver.navigate().back();
		
	}

}
