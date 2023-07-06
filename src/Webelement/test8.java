package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeOptions co = new ChromeOptions();
       co.addArguments("--remote-allow-access=*");
       WebDriver driver =new ChromeDriver(co);
       driver.manage().window().maximize();
       driver.get("https://www.google.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebElement searchbt = driver.findElement(By.id("APjFqb"));
       Dimension loc = searchbt.getSize();
      int x = loc.getHeight();
      System.out.println(x +":The height of the element");
      int y = loc.getWidth();
      System.out.println(y+":The width of the element");
      Thread.sleep(3000);
      driver.close();
	}

}
