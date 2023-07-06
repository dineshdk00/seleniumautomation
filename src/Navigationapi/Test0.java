package Navigationapi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	    driver.navigate().to("https://www.amazon.in/");
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.navigate().refresh();

	}

}
