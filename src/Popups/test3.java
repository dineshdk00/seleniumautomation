package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://skillrary.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle ignorelink\"])[2]")).click();
	       
	      WebElement click = driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]"));
	       click.click();
	       
	       
	       String parent = driver.getWindowHandle();
	       System.out.println(parent);
	       
	      Set<String> child = driver.getWindowHandles();
	      System.out.println(child);
	      
	      for(String b:child) {
	    	  driver.switchTo().window(b);
	      }
	       
	       WebElement name = driver.findElement(By.id("mytext"));
	       name.sendKeys("dinesh");
	       
	       Thread.sleep(3000);
	       driver.quit();
	}

}
