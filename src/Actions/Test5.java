package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://demoapp.skillrary.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       WebElement scrollele = driver.findElement(By.id("cars"));
	       
	       Select s = new Select(scrollele);
	       s.selectByIndex(1);
	       Thread.sleep(3000);
	       s.selectByValue("199");
	       Thread.sleep(3000);
	       //s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
	       
	       s.deselectByIndex(1);
	       Thread.sleep(3000);
	       s.deselectByValue("199");
	       Thread.sleep(3000);
	       //s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");
	       Thread.sleep(2000);
	       driver.close();
	       
	}

}
