package practice.hometest;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePageSampleTest {

	@Test
	public void homePageTest(Method mtd) {

		
		Reporter.log(mtd.getName() + "Start");
		
		/*
		 * Reporter.log("step-1"); Reporter.log("step-2"); Reporter.log("step-3");
		 * Reporter.log("step-4");
		 */
		//in order to see report in eclipse and testNG and till which step it is getting executed we can know by giving 2 args
		
		Reporter.log("step-1",true);
		Reporter.log("step-2",true);
		Reporter.log("step-3",true);
		Reporter.log("step-4",true);
		Reporter.log("END");

	}

	@Test
	public void verifyLogoHomePageTest(Method mtd) {
		Reporter.log(mtd.getName() + "Start");
		Reporter.log("step-1",true);
		Reporter.log("step-2",true);
		Reporter.log("step-3",true);
		Reporter.log("step-4",true);
		Reporter.log("END");
	}

}
