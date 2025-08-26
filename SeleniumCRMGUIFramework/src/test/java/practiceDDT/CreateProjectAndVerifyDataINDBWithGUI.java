package practiceDDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.mysql.cj.jdbc.Driver;

public class CreateProjectAndVerifyDataINDBWithGUI {

public static void main(String[] args) throws Throwable {
		
		
		//create a project in GUI using selenium  code
		String projectName="Instagram_1";
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://49.249.28.218:8091");
		 
		 driver.findElement(By.name("username")).sendKeys("rmgyantra");
		 driver.findElement(By.name("password")).sendKeys("rmgy@9999"); 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.linkText("Projects")).click();
		 driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		 driver.findElement(By.name("projectName")).sendKeys(projectName);
		 driver.findElement(By.name("createdBy")).sendKeys("Prakash");
		 Select sel=new Select(driver.findElement(By.xpath("(//select[contains(@name,'status')])[2]")));
		 sel.selectByVisibleText("On Going");
		 driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		 
		 //verify the Project in BackEnd[DB] using JDBC
		//step1: load/register the database driver
		 	Boolean flag= false;
		 
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
				 String actprojectName=resultSet.getString(4);
				  if(projectName.equalsIgnoreCase(actprojectName))
				 { 
					 flag= true;
					 System.out.println(projectName + "is available in DB==pass");
				 }
			 }
			 if(flag==false)
			 {
				 System.out.println(projectName +" is not available in DB===False");
				 Assert.fail();
			 }
			 
			 //step 5: close the connection
			 conn.close();
			 
}
	
}