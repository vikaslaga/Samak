package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 {
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	
	public loginpage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public boolean isbutton() {
		boolean stateofbutton=button.isDisplayed();
		return stateofbutton;
	}
	
	public void login (String user,String pass)
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		button.click();
		
	}
}
