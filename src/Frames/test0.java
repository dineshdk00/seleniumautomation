package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.snapdeal.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       WebElement signbtn = driver.findElement(By.xpath("//div[@class=\"accountInner\"]"));
	       // create a object for moueshover
	       Actions a = new Actions(driver);
	       a.moveToElement(signbtn).perform();
	       //click on loginbtn
	       WebElement loginbtn = driver.findElement(By.xpath("//a[text()='login']"));
	       loginbtn.click();
	       //switch to frame
	       driver.switchTo().frame(0);
	       WebElement idbtn = driver.findElement(By.id("userName"));
	       idbtn.sendKeys("9876543210");
	       //close btn
	       WebElement closebtn = driver.findElement(By.xpath("//i[@class=\"sd-icon sd-icon-delete-sign fnt-22\"]"));
	       Thread.sleep(3000);
	       closebtn.click();
	       //switch to frame by default
	       driver.switchTo().defaultContent();
	       WebElement namesch = driver.findElement(By.name("keyword"));
	       Thread.sleep(3000);
	       namesch.sendKeys("phone");
	       
	       Thread.sleep(2000);
	       driver.close();
	       
	       

	}

}
