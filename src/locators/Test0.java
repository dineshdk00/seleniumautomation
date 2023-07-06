package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//url of a website
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		//locators - id element
		driver.findElement(By.id("username")).sendKeys("trainee");
		Thread.sleep(3000);
		// locators - name element 
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		//locators - link text element 
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		//locators - partial link text 
		driver.findElement(By.partialLinkText("Return to login page")).click();
		
		
		

	}

}
