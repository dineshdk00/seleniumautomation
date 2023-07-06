package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeOptions co =new ChromeOptions();
       co.addArguments("--remote-allow-access=*");
       WebDriver driver = new ChromeDriver(co);
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebElement mobilebtn = driver.findElement(By.xpath("//a[text()='Mobiles']"));
       mobilebtn.click();
       WebElement mobileacc = driver.findElement(By.xpath("(//span[@class=\"nav-a-content\"])[2]"));
       
       Actions a =new Actions(driver);
       a.moveToElement(mobileacc).perform();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//a[text()='Apple']")).click();
       Thread.sleep(3000);
       driver.close();
       
       
	}

}
