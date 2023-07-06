package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeOptions co =new ChromeOptions();
       co.addArguments("--remote-allow-access=*");
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebElement selectbtn = driver.findElement(By.xpath("(//div[@class=\"_6ltg\"])[2]"));
       selectbtn.click();
      WebElement radiobtn = driver.findElement(By.xpath("//label[text()='Male']"));
      if(radiobtn.isSelected()) {
    	  System.out.println("pass:radiobutton element is selected");
    	  
      }
      else {
    	  System.out.println("fail:radiobutton element is not selected");
      }
      Thread.sleep(3000);
      driver.close();
	}

}
