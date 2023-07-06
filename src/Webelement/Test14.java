package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeOptions co =new ChromeOptions();
       co.addArguments("--remote-allow-access=*");
       WebDriver driver =new ChromeDriver(co);
       driver.manage().window().maximize();
       driver.get("https://demo.actitime.com/login.do");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Login ']"));
       if(loginbtn.isEnabled()) {
    	   System.out.println("Pass:login page is enabled");
    	   loginbtn.click();
       }
       else {
    	   System.out.println("Fail:login page is disabled");
       }
       Thread.sleep(3000);
       driver.close();
	}
	

}
