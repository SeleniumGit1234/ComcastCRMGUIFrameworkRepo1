package practiceDDT;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

		public class ExecuteSelectQueryTest {

			public static void main(String[] args) throws SQLException {
				
				Connection conn=null;
				try 
				{
				//step1: load/register the database driver
				Driver driverRef=new Driver();
				DriverManager.registerDriver(driverRef);
				
				//step2:connect to db
				conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_HRM", "root", "root");
				System.out.println("---Done-----");
				
				//step3 : create sql statement
				Statement stat = conn.createStatement();
				
				//step4:execute select query and get the result
				 ResultSet resultSet = stat.executeQuery("select * from project");
				 while(resultSet.next())
				 {
					 System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5)+"\t"+resultSet.getInt(6));
					 
				 }
				}
				catch(Exception e)
				{
					System.out.println("handle exception");
				}
				finally
				{
				 
				 //step 5: close the connection
				 conn.close();
				 System.out.println("=====close the connection=====");
				}

	}

}
