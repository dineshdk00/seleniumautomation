package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement clickbtn= driver.findElement(By.id("twotabsearchtextbox"));
		clickbtn.click();
	WebElement searchbtn= driver.findElement(By.id("twotabsearchtextbox"));
		searchbtn.sendKeys("phone");
		Thread.sleep(3000);
		searchbtn.clear();
		WebElement typebox=driver.findElement(By.id("twotabsearchtextbox"));
		typebox.sendKeys("laptop");
		 WebElement typebtn= driver.findElement(By.id("nav-search-submit-button"));
		typebtn.submit();

	}

}
