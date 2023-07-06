package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-access");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement searchbtn = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchbtn.sendKeys("mens");
		Thread.sleep(3000);
		List<WebElement> findbtn = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(findbtn.size());
		for(WebElement b:findbtn) {
			System.out.println(b.getText());
		}
		Thread.sleep(3000);
		driver.close();

	}

}
