package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeOptions co =new ChromeOptions();
        co.addArguments("--remote-allow-access=*");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement textbt=driver.findElement(By.id("headerContainer"));
        System.out.println(textbt.getText());
        Thread.sleep(3000);
        driver.close();        
	}

}
