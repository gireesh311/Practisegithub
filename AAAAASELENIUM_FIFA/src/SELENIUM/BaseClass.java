package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
static{
	System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
}
 static WebDriver driver = new FirefoxDriver();
//static WebDriver driver = new ChromeDriver();
//static WebDriver driver= new InternetExplorerDriver();

}

