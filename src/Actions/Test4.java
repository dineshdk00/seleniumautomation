package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-access=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	       WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	       
	       Actions a = new Actions(driver);
	       Thread.sleep(3000);
	       a.dragAndDrop(block1, block2).perform();
	       Thread.sleep(2000);
	       driver.close();
	       

	}

}
