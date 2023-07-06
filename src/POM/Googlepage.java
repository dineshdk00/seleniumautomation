package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlepage {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
         //To declare a element with name locator 
		@FindBy(name="q")
		private WebElement searchtb;
		
		public Googlepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
		//create a method
		public void searchtextbox(String name ) {
			searchtb.sendKeys(name);
			
			//this is not static method how do you call a non static method by creating a object 
			
		}
	}


