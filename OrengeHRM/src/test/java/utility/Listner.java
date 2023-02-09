package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.Basetest1;

public class Listner extends Basetest1 implements ITestListener{
	screenshot sc;
	public void onTestFailure(ITestResult result) {
		sc=new screenshot();
		try {
			sc.capture(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
