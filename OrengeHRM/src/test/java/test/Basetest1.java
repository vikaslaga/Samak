package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import page.loginpage1;

public class Basetest1 {
	public static WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	String path=(System.getProperty("user.dir")+"\\src\\test\\resources\\config.prop");
	@BeforeSuite
public void initialbrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\OneDrive\\Desktop\\New folder\\SE\\chromedriver.exe");
	 driver= (WebDriver) new ChromeDriver();
	driver.manage().window().maximize();
	prop=new Properties();
	fis=new FileInputStream(path);
	prop.load(fis);
	driver.get(prop.getProperty("URL"));
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@AfterSuite
public void teardown () throws InterruptedException {
	driver.close();
	Thread.sleep(2000);
}
}
