package practiceTestNg;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(priority=-1)
	public void createContactTest()
	{
		System.out.println("execute CreateContact----HDFC");
		
	}
	
	@Test(priority=1)
	public void modifyContactTest()
	{
		//System.out.println("execute CreateContact");
		System.out.println("execute query insert contact in DB===ICICI");
		System.out.println("execute modifyContactTest");
		
	}
	
	@Test(priority=2)
	public void deleteContactTest()
	{
		System.out.println("execute CreateContact");
		System.out.println("execute deleteContactTest");
		
	}
	

}
