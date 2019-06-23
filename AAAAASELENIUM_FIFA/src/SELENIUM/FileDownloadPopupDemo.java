package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class FileDownloadPopupDemo  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxProfile profile =new FirefoxProfile();
		String key ="browser.helperApps.neverAsk.saveToDisk";
		String value="application/zip";
		profile.setPreference(key,value);
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.dir","G:\\Downloads");
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver = new FirefoxDriver(option );
		driver.get("https://www.seleniumhq.org/download/");
		//driver.findElement(By.xpath("//ul//li/a[text()='Download']")).click();;
		String xp ="//td[text()='Java']/../td/a[text()='Download']";
		driver.findElement(By.xpath(xp)).click();
		
		 Thread.sleep(3000);
		
		

	}

}
