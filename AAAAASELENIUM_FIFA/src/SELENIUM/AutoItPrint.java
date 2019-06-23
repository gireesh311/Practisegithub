package SELENIUM;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class AutoItPrint extends BaseClass {

	public static void main(String[] args) throws Exception {
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		Runtime run = Runtime.getRuntime();
				run.exec("H:\\print.exe");
				
	}

}
