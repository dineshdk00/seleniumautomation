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

public class test5 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		   co.addArguments("--remote-allow-access-origins*=");
		   WebDriver driver = new ChromeDriver(co);
		   driver.manage().window().maximize();
		   driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   WebElement scrlbtn = driver.findElement(By.xpath("(//select[@class=\"col-lg-3\"])[3]"));
		   
		   Select s = new Select(scrlbtn);
		   s.selectByIndex(0);
		   s.selectByValue("donut");
		   s.selectByVisibleText("burger");

		   List<WebElement> options = s.getOptions();
		   System.out.println(options.size());
		   
		   ArrayList bb = new ArrayList<>();
		   
		   for(WebElement opt:options) {
			   String text = opt.getText();
			   bb.add(text);
			   System.out.println(text);
			   
			   System.out.println("**********aftersorting********");
			  Collections.sort(bb);
			  for(Object scldw:bb) {
				  System.out.println(scldw);
				  
			  }
			  driver.close();
			   
		   }
	}
}


