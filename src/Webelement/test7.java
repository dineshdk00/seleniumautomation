package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebElement searchbx = driver.findElement(By.id("twotabsearchtextbox"));
     Dimension loc = searchbx.getSize();
     int x = loc.getHeight();
     System.out.println( x+":The height of the location is ");
    int y = loc.getWidth();
    System.out.println(y+":The width of the location is ");
    Thread.sleep(3000);
    driver.close();
	}

}
