package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeOptions co =new ChromeOptions();
     co.addArguments("--remote-allow-access=*");
     WebDriver driver =new ChromeDriver(co);
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     WebElement loginbtn = driver.findElement(By.name("login"));
     if(loginbtn.isEnabled()) {
    	 System.out.println("Pass:login button is enabled");
    	 loginbtn.click();
    	 
     }
     else {
    	 System.out.println("Fail:login button is not enabled");
     }
     Thread.sleep(3000);
     driver.close();
	}

}
