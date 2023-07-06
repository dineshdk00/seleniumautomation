package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		//locators - linkText element
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(3000);
		//locators - id element
		driver.findElement(By.id("email")).sendKeys("user");
		Thread.sleep(3000);
		//locators - name element 
		driver.findElement(By.name("password")).sendKeys("user");
		Thread.sleep(300);
		//locators - link text
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		//locators - partial link text 
		driver.findElement(By.partialLinkText("Return")).click();
		
		
		
		

	}

}
