package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-access=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://demoapp.skillrary.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
          WebElement coursebtn = driver.findElement(By.id("course"));
	      
          Actions a = new Actions(driver);
          a.moveToElement(coursebtn).perform();
           WebElement mouseovbtn = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]"));
           mouseovbtn.click();
           WebElement addbtn = driver.findElement(By.id("add"));
           Thread.sleep(3000);
           a.doubleClick(addbtn).perform();
           Thread.sleep(3000);
           driver.close();
          
          
	}

}
