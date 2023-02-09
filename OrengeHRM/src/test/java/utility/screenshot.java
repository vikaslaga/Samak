package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public void capture(WebDriver driver,String name) throws IOException {
		TakesScreenshot tcs=(TakesScreenshot)driver;
	//capture
	File source=tcs.getScreenshotAs(OutputType.FILE);
	//store location
	File file=new File(System.getProperty(("user.dir")+"\\folder\\" +name+".png"));
	FileHandler.copy(source, file);
		
	}
}
