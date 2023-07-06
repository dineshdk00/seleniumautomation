package scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       WebElement fitness = driver.findElement(By.xpath("//img[@alt=\"For your Fitness Needs\"]"));
	      Point loc = fitness.getLocation();
	      int x = loc.getX();
	      int y = loc.getY();
	      
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy("+x+","+y+")");
	    Thread.sleep(5000);
	    fitness.click();
	    
	    // System.out.println(x+y); -- values of x and y 
	    // system.out.println("x+y"] -- it is a string 
	    
	       

	}

}
