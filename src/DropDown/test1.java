package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-access=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	       
	      Select s = new Select(dropdown);
	      s.selectByIndex(4);
	      Thread.sleep(3000);
	      s.selectByValue("search-alias=computers-intl-ship");
	      Thread.sleep(3000);
	      s.selectByVisibleText("Electronics");
	      Thread.sleep(2000);
	      driver.close();
	      
	      
	}

}
