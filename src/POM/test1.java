package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	      // co.addArguments("disable notification");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demo.actitime.com/login.do");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       Actitime a = new Actitime(driver);
	       a.usernamebx("admin");
	       a.pwdbx("manager");
	       a.loginbtn();
	       
	       
	       

	}

}
