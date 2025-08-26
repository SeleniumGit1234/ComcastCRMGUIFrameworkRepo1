package practiceDDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleUnitTestCheckInBackEnd {

	@Test
	public  void projectCheckTest() throws SQLException
	{
		String expectedProjectName="FB_1";
		Boolean flag= false;
		
		//step1: load/register the database driver
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step2:connect to db
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_HRM", "root", "root");
		System.out.println("---Done-----");
		
		//step3 : create sql statement
		Statement stat = conn.createStatement();
		
		//step4:execute select query and get the result
		 ResultSet resultSet = stat.executeQuery("select * from project");
		 while(resultSet.next())
		 {
			 String projectName=resultSet.getString(4);
			 System.out.println(projectName);
			 if(expectedProjectName.equalsIgnoreCase(projectName))
			 { 
				 flag= true;
				 System.out.println(expectedProjectName + "is available==pass");
			 }
		 }
		 if(flag==false)
		 {
			 System.out.println(expectedProjectName +" is not available==False");
		 }
		 
		 //step 5: close the connection
		 conn.close();
		
	}

}
