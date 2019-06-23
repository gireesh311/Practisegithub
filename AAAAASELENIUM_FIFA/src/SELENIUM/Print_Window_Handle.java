package SELENIUM;

import java.util.Set;

public class Print_Window_Handle extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.naukri.com");
		Set<String> WHandles=driver.getWindowHandles();
			System.out.println(" the window handle is "+ WHandles);
		Thread.sleep(2000);
		driver.quit();

	}

}
