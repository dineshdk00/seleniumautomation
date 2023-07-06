package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeOptions co =new ChromeOptions();
        co.addArguments("--remote-allow-access=*");
        WebDriver driver =new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement textele=driver.findElement(By.xpath("//h2[@class='_8eso']"));
        System.out.println(textele.getText());
        Thread.sleep(2000);
        driver.close();
	}

}
