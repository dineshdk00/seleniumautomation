package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test0 {

	
		// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeOptions co = new ChromeOptions();
       co.addArguments("--remote-allow-access=*");
       WebDriver driver =new ChromeDriver(co);
       driver.manage().window().maximize();
       driver.get("https://demoapp.skillrary.com/login.php?type=login");
    
       driver.findElement(By.id("email")).sendKeys("user");
     
       driver.findElement(By.name("password")).sendKeys("user");
       
       driver.findElement(By.name("login")).click();
       
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       
       String acutaltitle = "SkillRary Courses";
       if(acutaltitle.equals("SkillRary Courses")) {
    	   System.out.println("pass : it is a vaild url is vaild");
       }
       else {
    	   System.out.println("fail : invaild url ");
       }
       String url = "https://demoapp.skillrary.com/login.php";
       if(url.equals("https://demoapp.skillrary.com/login.php")){
    	   System.out.println("pass : It is a vaild url");
       }
       else {
    	   System.out.println("fail : It is Invaild url");
       }
    
       driver.close();

	}

}
