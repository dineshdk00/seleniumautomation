package Windowmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeOptions co =new ChromeOptions();
       co.addArguments("--remote-allow-access=*");
       WebDriver driver = new ChromeDriver(co);
       Thread.sleep(2000);
       driver.manage().window().minimize();
       Thread.sleep(3000);
       driver.get("https://demo.opencart.com/");
       Thread.sleep(4000);
       driver.manage().window().maximize();
       Thread.sleep(4000);
       driver.manage().window().fullscreen();
        

	}

}
