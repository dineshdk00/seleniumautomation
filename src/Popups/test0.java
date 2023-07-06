package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH KUMAR\\eclipse-workspace\\Seleniumautomation\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://demoapp.skillrary.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       WebElement courses = driver.findElement(By.xpath("//button[@class=\"dropbtn\"]"));
	       Actions a = new Actions(driver);
	       a.moveToElement(courses).perform();
	       
	       WebElement clickbtn = driver.findElement(By.xpath("(//a[text() ='Selenium Training'] )[1]"));
	       clickbtn.click();
	       
	       WebElement addcart = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
	       addcart.click();
	       
	     
	       Alert c = driver.switchTo().alert();
	   
	       System.out.println(c.getText());
	       // c.accept();
	          
	       c.dismiss();
           Thread.sleep(2000);
           driver.close();
	       

	}

}
