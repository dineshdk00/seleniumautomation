package DropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class test4 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		   co.addArguments("--remote-allow-access-origins*=");
		   WebDriver driver = new ChromeDriver(co);
		   driver.manage().window().maximize();
		   driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   WebElement dropbtn = driver.findElement(By.xpath("(//select[@class=\"col-lg-3\"])[1]"));
		   
		   Select s = new Select(dropbtn);
		   s.selectByIndex(3);
		   s.selectByValue("Google"); 
		   s.selectByVisibleText("Iphone");
		   
		   List<WebElement> optionstxt = s.getOptions();
		   System.out.println(optionstxt.size());
		   
		   ArrayList box = new ArrayList<>();
		   
		   for(WebElement options:optionstxt) {
			   String text = options.getText();
			   box.add(text);
			   System.out.println(text);
		   }
		   System.out.println("********elements after sorting*********");
		 //  Collections.sort(box);
		   Collections.sort(box,Collections.reverseOrder());
		   for(Object bb:box) {
			   System.out.println(bb);
		   }
		   driver.close();
	}

}
