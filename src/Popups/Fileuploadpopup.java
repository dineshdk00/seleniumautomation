package Popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileuploadpopup {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	      // co.addArguments("disable notification");
	       WebDriver driver = new ChromeDriver(co);
	       driver.manage().window().maximize();
	       driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=EAIaIQobChMIsOX8_YPo_gIVDh9yCh1L9AH2EAAYASAAEgI8nfD_BwE&gclsrc=aw.ds");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
	       WebElement uploadbtn = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
	       uploadbtn.click();
	       
	   Runtime.getRuntime().exec("C:\\Users\\DINESH KUMAR\\OneDrive\\Desktop\\Fileuploadpopup123.au4.exe");
	}

}
