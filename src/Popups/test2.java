package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
           
	       driver.switchTo().newWindow(WindowType.TAB);
	       driver.get("https://www.amazon.com/");
	       
	       String parent = driver.getWindowHandle();
	       System.out.println(parent);
	       Set<String> child = driver.getWindowHandles();
	       System.out.println(child);
	       driver.quit();
	       
	}

}
