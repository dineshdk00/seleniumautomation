package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeOptions co =new ChromeOptions();
         co.addArguments("--remote-allow-access=*");
         WebDriver driver = new ChromeDriver(co);
          driver.manage().window().maximize();
          driver.get("https://www.google.com/");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
          WebElement searchbx = driver.findElement(By.id("APjFqb"));
          if(searchbx.isDisplayed()) {
        	  System.out.println("pass:element is displayed");
        	  searchbx.sendKeys("computer");
          }
          else {
        	  System.out.println("Fail:element is notdisplayed");
          }
          Thread.sleep(3000);
          driver.close();
	}

}
