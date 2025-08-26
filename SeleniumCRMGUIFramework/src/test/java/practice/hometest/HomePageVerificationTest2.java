package practice.hometest;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageVerificationTest2 {
	@Test
	public void homePageTest(Method mtd) 
	{
		SoftAssert assertObj=new SoftAssert();
		System.out.println(mtd.getName() + "Start");
		System.out.println("step-1");
		System.out.println("step-2");
		//hard Assert
		//Assert.assertEquals("HOME", "HOME");
		//soft assert
		//assertObj.assertEquals("HOME", "HOME PAGE");
		//hard Assert for mandatory fields
		Assert.assertEquals("HOME", "HOME");
		System.out.println("step-3");
		//softassert for non mandatory fields
		assertObj.assertEquals("HOME-CRM", "HOME");
		System.out.println("step-4");
		assertObj.assertAll();
		System.out.println("END");

	}

	@Test
	public void verifyLogoHomePageTest(Method mtd) 
	{
		SoftAssert assertObj1=new SoftAssert();
		System.out.println(mtd.getName() + "Start");
		System.out.println("step-1");
		System.out.println("step-2");
		assertObj1.assertTrue(true);
		System.out.println("step-3");
		System.out.println("step-4");
		assertObj1.assertAll();
		System.out.println("END");

	}

}
