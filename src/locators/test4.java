package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-access=*");
		// webdriver - it is a interface which consist of 11 abstract mrthods of its own and extends method from search context
		// driver - use of the driver is to interact with webpage 
		//chromedriver = (constructor - inside the constructor default constructor open/lauch empty browser) , 
		//chromedriver is a class which extends remote webdriver
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // for xpath  - go with id first and then name second and the third is linktext and fourth is xpath 
        // lauch url 
        driver.get("https://demo.actitime.com/login.do");
        Thread.sleep(3000);
        // loactor by id element 
        driver.findElement(By.id("username")).sendKeys("trainee");
        Thread.sleep(3000);
        // locator by name element
        driver.findElement(By.name("pwd")).sendKeys("trainee");
        // There is no link text so we go with xapth we have 5 xpath expression 
        //1.xpath by attributes - syntax = //tagname[@AN='AV']
        //2.Xpath by Text - synatx = //tagname[text()='tv']
        //3.xpath by contains - if the element is partially changing and it conatis spaces -- 
        //      synatx -- //tagname[@AN,'AV']
        //        syntax -- //tagname[text(),'tv']
        //4.  xpath by groupIndex (xpath expression)[postion value]
        //5. xpath by dynamic changing element / xpath by Traversing / Independent&dependentxpath
        // synatx = //span[text()='phone']
        // /- indicates traversing from parent to immediate child
        // //- traversing from parent to any child 
        // /.. - traversing from child to parent 
        Thread.sleep(3000);
        // xpath by text - //tagname[text()='tv']
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//div[@id=\"closeProjectLightBoxBtn\"]")).click();
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
       String title="actiTIME - Enter Time-Track";
       if(title.equals("actiTIME - Enter Time-Track")){
    	   System.out.println("pass : It is vaild title ");
       }
       else {
    	   System.out.println("fail : It is invaild title ");
       }
       
       String url = "https://demo.actitime.com/user/submit_tt.do";
       if(url.equals("https://demo.actitime.com/user/submit_tt.do")) {
    	   System.out.println("Pass : It is a vaild url ");
       }
       else {
    	   System.out.println("Fail : It is Invaild url");
       }
       Thread.sleep(3000);
       driver.close();
       
	}

}
