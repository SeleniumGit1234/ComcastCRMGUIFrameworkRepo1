package practiceTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToPracticePriority {
	@Test(priority = 3)
	public void baskinRobbins()
	{
		Reporter.log("Baskin Robbins executed successfully");
	}
	@Test(priority = 5)
	public void zomato()
	{
		Reporter.log("Baskin Robbins executed successfully");
	}
	@Test(priority = 3)
	public void bigBasket()
	{
		Reporter.log("Baskin Robbins executed successfully");
	}
	@Test
	public void zepto()
	{
		Reporter.log("Baskin Robbins executed successfully");
	}
	@Test(priority = -7)
	public void amazon()
	{
		Reporter.log("Baskin Robbins executed successfully");
	}
	
	

}
