package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-access");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement selectbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(selectbox.isSelected()) {
			System.out.println("pass:The element is selected");
		}
		else {
			System.out.println("fail : the element is not selected");
		}
        Thread.sleep(3000);
        driver.close();
        
	}

}
