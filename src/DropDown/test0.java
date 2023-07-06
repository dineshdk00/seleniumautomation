package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-access=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.ebay.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       WebElement dropdown = driver.findElement(By.id("gh-cat"));
	       
	       Select s =new Select(dropdown);
	       Thread.sleep(3000);
	       s.selectByIndex(2);
	       Thread.sleep(3000);
	       s.selectByValue("267");
	       Thread.sleep(3000);
	       s.selectByVisibleText("Cell Phones & Accessories");
	       Thread.sleep(2000);
	       driver.close();
	       
	}

}
