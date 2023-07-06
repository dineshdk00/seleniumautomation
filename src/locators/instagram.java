package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("manager");
		Thread.sleep(3000);
		//xpath by contains syntax -- //tagname[contains(@AV,'av')]
		driver.findElement(By.xpath("(//div[contains(@class,'x9f619')])[10]")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String title = "Instagram";
		if(title.equals("Instagram")) {
			System.out.println("pass:url is vaild");
		}
		else {
			System.out.println("fail:url is invaild");
		}
	}

}
