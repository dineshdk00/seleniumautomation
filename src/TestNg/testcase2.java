package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase2 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@Test
	public void tc2()
	{
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.name("email")).sendKeys("2345678");
		driver.findElement(By.id("did_submit")).click();
		String url = driver.getTitle();
		SoftAssert s = new SoftAssert();
    	s.assertEquals(url,"Forgotten Password | Can't Log In | Facebook");
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
		s.assertAll();
		
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
	}
