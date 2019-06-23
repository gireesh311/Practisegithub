package SELENIUM;

public class FirstSeleniumScript extends BaseClass {

	public static void main(String[] args) throws Exception {
		driver.get("http://www.wikipedia.com");
		String title =driver.getTitle();
		System.out.println("the title of the page is  "+title);
		String currentUrl =driver.getCurrentUrl();
		System.out.println("the current url is  "+currentUrl);
		String htmlSource =driver.getPageSource();
		System.out.println("the html source code is  "+htmlSource);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
