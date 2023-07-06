package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeOptions co =new ChromeOptions();
     co.addArguments("--remote-allow-access=*");
     WebDriver driver = new ChromeDriver(co);
     driver.manage().window().maximize();
     driver.get("https://www.amazon.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     WebElement searchbtn = driver.findElement(By.id("twotabsearchtextbox"));
    Point loc = searchbtn.getLocation();
    int x = loc.getX();
    System.out.println(x+ ":codrinates of x");
   int y = loc.getY();
   System.out.println(y+ ":codrinates of y");
   Thread.sleep(2000);
   driver.close();
	}

}
