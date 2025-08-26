package practiceTestNg;

import org.testng.annotations.Test;

public class CreateOrderTest {

	
	@Test
	public void createOrderTest()
	{
		System.out.println("execute Create order test===123");
		
	}
	@Test(dependsOnMethods="createOrderTest")
	public void billingOrderTest()
	{
		System.out.println("execute billingOrderTest===123");
		
	}
}
