package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testing  {

	public static void main(String[] args) {
	//	RemoteWebDriver driver = new RemoteWebDriver(url of grid, specify on which browser we want execute /eg:firefox);
		TargetLocator driver= (TargetLocator) new FirefoxDriver();
		((WebDriver) driver).get("https://www.google.co.in");
		//driver.get("https://www.wikipedia.co.in");
		((WebDriver) driver).get("http://desktop-89emb6r/login.do");
		((WebDriver) driver).navigate().back();
		((WebDriver) driver).close();

	

}
