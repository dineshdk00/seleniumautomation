package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement searchbtn = driver.findElement(By.id("APjFqb"));
		Point loc = searchbtn.getLocation();
		int x = loc.getX();
		int y = loc.getY();
        System.out.println(x+ ":coodinates of x");
        System.out.println(y+ ":coodinates of y");
        Thread.sleep(2000);
        driver.close();
	}

}
