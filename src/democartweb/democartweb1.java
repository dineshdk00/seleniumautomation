package democartweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class democartweb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-orginis=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement myaccbtn = driver.findElement(By.xpath("//span[text()=\"My Account\"]"));
		myaccbtn.click();
		
		WebElement regbtn = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(regbtn).perform();
		regbtn.click();
		

	}

}
