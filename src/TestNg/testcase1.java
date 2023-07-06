package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class testcase1 {
	//we need declare it globally 
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
    @Test
    public void tc1() {
    	driver.findElement(By.id("email")).sendKeys("admin");
    	driver.findElement(By.id("pass")).sendKeys("manager");
    	driver.findElement(By.name("login")).click();
    	String title = driver.getTitle();
    	
    	//example 
    	//SoftAssert s = new SoftAssert();
    	//s.assertEquals(title,"Facebook � log in or sign up");
    	
    	Reporter.log(title,true);
    	//Reporter.log(driver.getTitle(),true);
    	String url = driver.getCurrentUrl();
    	Reporter.log(url,true);
    	//Reporter.log(driver.getCurrentUrl(),true);
        //s.assertAll();
    }
    
    @AfterMethod
    public void closeapp() {
    	driver.close();
    }
}
