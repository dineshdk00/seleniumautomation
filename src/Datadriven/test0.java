package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//need to create a object for properties 
		Properties p = new Properties(); 
		//create a object for the class to specify the path 
		FileInputStream fis = new FileInputStream("./data.properties");
		
//we need load it 
		p.load(fis);
		
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	      // co.addArguments("disable notification");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get(p.getProperty("url"));
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
	       driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
	
	}

}
