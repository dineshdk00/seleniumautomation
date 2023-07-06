package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      ChromeOptions co =new ChromeOptions();
      co.addArguments("--remote-allow-access=*");
      WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.vtiger.com/vtigercrm/index.php");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      WebElement usernamebtn=driver.findElement(By.id("username"));
      Thread.sleep(3000);
      usernamebtn.clear();
      WebElement passwordbtn = driver.findElement(By.id("password"));
      Thread.sleep(3000);
      passwordbtn.clear();
      WebElement submitbtn= driver.findElement(By.xpath("//button[text()='Sign in']"));
      Thread.sleep(3000);
      submitbtn.submit();
	}

}
