	package practiceTestNg;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class CreateContact_DP_Test2 {
		
		@Test(dataProvider="getData")
		public void createcontactTest(String firstName,String lastName,long phoneNum)
		{
			System.out.println(firstName+lastName+phoneNum);
			
		}
		
		@DataProvider
		public Object[][] getData()
		{
			Object[][] objArray = new Object[3][3];
			objArray[0][0]="Pavani";
			objArray[0][1]="st";
			objArray[0][2]=6301718270l;
			
			
			objArray[1][0]="niyathi";
			objArray[1][1]="se";
			objArray[1][2]=9999999999l;
			
			objArray[2][0]="vijaya";
			objArray[2][1]="officer";
			objArray[2][2]=9999999998l;
			
			
			return objArray;
		}

	}


