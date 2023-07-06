package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {
	
	@FindBy(name="username")
	private WebElement usernametxtbx;
	@FindBy(name="pwd")
	private WebElement pwdtxtbx;
	@FindBy(xpath="//div[text()=\"Login \"]")
	private WebElement loginbx;
	
	public Actitime(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//create a method 
	public void usernamebx(String user) {
	    usernametxtbx.sendKeys(user);	    		
	}
	
	public void pwdbx(String pwd) {
		pwdtxtbx.sendKeys(pwd);
	}
	
	public void loginbtn() {
		loginbx.click();
	}

}
