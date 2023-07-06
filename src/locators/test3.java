package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		Thread.sleep(3000);
		//locators - css selector it should match 1 of 1 
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("user");
		Thread.sleep(3000);
		//locators - css selector it should match 1 of 1 
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("user");
		

	}

}
