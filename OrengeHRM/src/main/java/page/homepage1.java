package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage1 {
@FindBy(xpath="//span[@class='oxd-userdropdown-tab']//p")
private WebElement getlink;
@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li[3]//a")
private WebElement logout;
public homepage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getlink() {
	return getlink;
}
public WebElement getlogoutlink() {
	return logout;
}

}
