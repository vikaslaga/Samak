package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.loginpage1;

public class logintest1 extends Basetest1 {
	loginpage1 lp;
	@BeforeClass
	public void initialobj() {
		lp=new loginpage1(driver);
	
	}
	@Test(priority=1)
	public void verifybutton() {
		System.out.println(lp.isbutton());
		Assert.assertFalse(lp.isbutton());
	}

	@Test (priority=2)
	public void login() {
		
		lp.login("Admin", "admin123");
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
	


