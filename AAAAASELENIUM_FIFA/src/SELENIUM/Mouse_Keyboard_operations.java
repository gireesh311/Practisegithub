package SELENIUM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Mouse_Keyboard_operations extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		driver.navigate().to("http://www.google.com");
		Thread.sleep(5000);
		Robot r= new Robot();
		r.mouseMove(4000, 4000);
		//press alt 
		r.keyPress(KeyEvent.VK_ALT);
		//press f
		r.keyPress(KeyEvent.VK_F);
		//release alt
		r.keyRelease(KeyEvent.VK_ALT);
		//release alt
		r.keyRelease(KeyEvent.VK_F);
		Thread.sleep(3000);
		//press alt
		
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		Thread.sleep(3000);
		
		
		driver.close();
		driver.quit();
		                  
	}

}
