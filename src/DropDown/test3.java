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

public class test3 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		   co.addArguments("--remote-allow-access-origins*=");
		   WebDriver driver = new ChromeDriver(co);
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.com/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   WebElement dropbtn = driver.findElement(By.id("searchDropdownBox"));
		   
		   Select s = new Select(dropbtn);
		   s.selectByIndex(0);
		   s.selectByValue("search-alias=automotive-intl-ship");
		   s.selectByVisibleText("Books");
		   
		   List<WebElement> options = s.getOptions();
		   System.out.println(options.size());
		   
		   ArrayList b = new ArrayList<>();
		   for( WebElement a:options) {
			   String text = a.getText();
			   b.add(text);
			   
			   System.out.println(text);
		   }
		   System.out.println("*****aftersorting**********");
		   Collections.sort(b);
		   
		   for(Object opt:b) {
			   System.out.println(opt);
		   }
		   driver.close();
		   
	}

}
