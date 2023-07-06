package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	      // co.addArguments("disable notification");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.google.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       //WebElement search = driver.findElement(By.id("APjFqb"));
	       Googlepage g =new Googlepage(driver);
	       driver.navigate().refresh();
	       g.searchtextbox("phone");
           //search.sendKeys("phone");
	}

}
