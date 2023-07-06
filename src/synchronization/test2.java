package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	    
		WebElement usernametb=driver.findElement(By.name("username"));
	    wait.until(ExpectedConditions.visibilityOf(usernametb)).sendKeys("admin");
		
	    WebElement usernamepwd=driver.findElement(By.name("password"));
		wait.until(ExpectedConditions.visibilityOf(usernamepwd)).sendKeys("manager");
		//Thread.sleep(3000);
		
		WebElement clickbtn=driver.findElement(By.xpath("(//div[contains(@class,'x9f619')])[10]"));
		wait.until(ExpectedConditions.visibilityOf(clickbtn)).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String title = "Instagram";
		wait.until(ExpectedConditions.titleContains("Instagram"));
		if(title.equals("Instagram")) {
			System.out.println("pass:url is vaild");
		}
		else {
			System.out.println("fail:url is invaild");
		}
	




}

}


