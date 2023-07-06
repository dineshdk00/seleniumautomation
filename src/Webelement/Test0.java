package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
       
	    WebElement searchbtn= driver.findElement(By.id("APjFqb"));
	   // wait.until(ExpectedConditions.visibilityOf(searchbtn)).sendKeys("phonepe");
	    searchbtn.sendKeys("phonepe");
	    Thread.sleep(3000);
	    searchbtn.clear();
	}

}
