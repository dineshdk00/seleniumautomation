package scrollbar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       //Typecasing 
	       JavascriptExecutor js=(JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,5000)");
	       Thread.sleep(3000);
	       js.executeScript("window.scrollBy(0,-5000)");
	       

	}

}
