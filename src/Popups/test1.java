package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://demo.actitime.com/login.do");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       WebElement username = driver.findElement(By.id("username"));
           username.sendKeys("admin");
           
           
          WebElement password = driver.findElement(By.name("pwd"));
          password.sendKeys("manager");
          
       
          WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
          login.click();
          
         
          WebElement date = driver.findElement(By.xpath("(//em[@unselectable=\"on\"])[1]"));
          date.click();
          
          
           WebElement seldate = driver.findElement(By.xpath("//span[text()='9']"));
           seldate.click();
           
	}

}
