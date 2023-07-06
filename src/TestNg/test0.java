package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test0 {
	
	@Test
	public void demo() {
		Reporter.log("hello java",true);
		Reporter.log("hello selenium",false);
	}

}
