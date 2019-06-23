package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://desktop-89emb6r/login.do");
		LoginPage lp = new LoginPage(driver);
		lp.Login("admin","manager");
		lp.errormsg();
		driver.close();

	}

}
