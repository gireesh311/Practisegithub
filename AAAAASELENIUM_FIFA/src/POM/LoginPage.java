package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	@FindBy(name="username")
	private WebElement UNBTN;
	@FindBy(name="pwd")
	private WebElement PWDBTN;
	@FindBy(id="loginButton")
	private WebElement LOGBTN;
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errmsg;
	public void Login(String un,String pwd) {
		UNBTN.sendKeys("un");
		PWDBTN.sendKeys("pwd");
		LOGBTN.click();
	}
	public void errormsg() {
		String msg = errmsg.getText();
		System.out.println(msg);
	}
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
}
