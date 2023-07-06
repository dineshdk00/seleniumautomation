package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-access=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.google.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
           WebElement searchbtn = driver.findElement(By.id("APjFqb"));
           
           Actions a = new Actions(driver);
           Thread.sleep(3000);
           a.contextClick(searchbtn).perform();
           
	}

}
