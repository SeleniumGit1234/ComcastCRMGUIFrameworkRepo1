package practiceDDT;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;

import org.testng.Assert;

import com.mysql.cj.jdbc.Driver;

		public class ExecuteNonSelectQueryTest {

			public static void main(String[] args) throws SQLException {
				
				//step1: load/register the database driverd
				Driver driverRef=new Driver();
				DriverManager.registerDriver(driverRef);
				
				//step2:connect to db
				Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_HRM", "root", "root");
				System.out.println("---Done-----");
				
				//step3 : create sql statement
				Statement stat = conn.createStatement();
				
				//step4:execute select query and get the result
				int result = stat.executeUpdate("insert into project values('TY_PROJ_2000','Deepak','04/27/2023','FB_002','on going','100')");
				System.out.println(result);
				Assert.fail();
				 
				 //step 5: close the connection
				 conn.close();
			

			}

		

	}
