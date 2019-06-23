package SELENIUM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ScreenshotDemo extends BaseClass  {

	public static void main(String[] args) throws IOException {
	
		driver.get("http://www.flipkart.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile =ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/flipkart1.PNG");
		FileUtils.copyFile(srcFile,destFile);
		driver.close();

	}

}
