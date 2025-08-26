package practiceTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToPracticeDependsOnMethods {
	@Test
	public void createAccount()
	{
		Reporter.log("account successfully created",true);
	}
	@Test(dependsOnMethods = "createAccount")
	public void editAccount()
	{
		Reporter.log("account is edited successfully",true);
	}
	@Test(dependsOnMethods = {"editAccount","createAccount"})
	public void deleteAccount()
	{
		Reporter.log("account is deleted successfully",true);
				
	}

}
