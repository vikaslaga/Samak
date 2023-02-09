package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.homepage1;

public class homepagetest1 extends Basetest1 {
homepage1 hp;
@BeforeClass
public void iniobject() {
	hp=new homepage1(driver);
}
@Test(priority=3)
public void logout() {
	hp.getlink().click();
	hp.getlogoutlink().click();
}
}
