package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      //step 1: Typecasting 
	       TakesScreenshot ts =(TakesScreenshot)driver;
	       
	       //step 2: Access The method and photo is stored in ram 
	       File RAM = ts.getScreenshotAs(OutputType.FILE);
	       
	       //step 3: specifiy the location 
	       File dest = new File("./photo/amazon.png");
	
		//step4 : copy paste from Ram to required location 
	       FileUtils.copyFile(RAM, dest);
	       
	      driver.close();
	      
	       
	       

	}

}
