package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeOptions co =new ChromeOptions();
       co.addArguments("--remote-allow-access=*");
       WebDriver driver =new ChromeDriver(co);
       driver.manage().window().maximize();
       driver.get("https://www.ebay.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebElement menbtn = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
       
       Actions a = new Actions(driver);
       a.moveToElement(menbtn).perform();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//a[text()='Samsung'])")).click();
       
       
	}

}
