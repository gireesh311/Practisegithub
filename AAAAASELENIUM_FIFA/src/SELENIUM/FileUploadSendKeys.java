package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadSendKeys extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		String filePath="C:\\Users\\user1\\Desktop\\Selenium Notes_Weekend batch_10 to 2 PM_BTM.docx.pdf";
		driver.findElement(By.xpath("//input[@type='file'][2]")).sendKeys(filePath);
		driver.findElement(By.xpath("//button[@ng-click='uploader.uploadAll()']")).click();
		//driver.findElement(By.xpath("//button[@ng-disabled='item.isReady || item.isUploading || item.isSuccess']")).click();

	}

}
