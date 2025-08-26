package practiceTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DataProviderTest {
	
	@Test(dataProvider="getData")
	public void createcontactTest(String firstName,String lastName)
	{
		System.out.println(firstName+lastName);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objArray = new Object[3][2];
		objArray[0][0]="Pavani";
		objArray[0][1]="st";
		
		objArray[1][0]="niyathi";
		objArray[1][1]="se";
		
		objArray[2][0]="vijaya";
		objArray[2][1]="officer";
		
		return objArray;
	}

}
