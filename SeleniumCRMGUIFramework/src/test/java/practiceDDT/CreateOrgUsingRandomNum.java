package practiceDDT;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.safari.SafariDriver;

	public class CreateOrgUsingRandomNum {
		public static void main(String[] args) throws IOException, InterruptedException{
				
			//read common data from properties file
				FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\CommonData.properties");
				
				Properties prop= new Properties();
				prop.load(fis);
				
				String BROWSER=prop.getProperty("browser");
				String URL=prop.getProperty("url");
				String USERNAME=prop.getProperty("username");
				String PASSWORD=prop.getProperty("password");
				//generate random number
				Random random = new Random();
				int randomInt=random.nextInt(1000);
				//read test script data from excel file
				FileInputStream fisf=new FileInputStream("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\MultipleTestDataScript.xlsx");
				Workbook wb=WorkbookFactory.create(fisf);
				Sheet sh=wb.getSheet("Sheet2");
				Row row=sh.getRow(1);
				Cell cell=row.getCell(2);
				String ORGNAME=cell.getStringCellValue()+randomInt;	
				wb.close();
				
				//launching browser at run time
				WebDriver driver=null;	
				 
				 if(BROWSER.equals("Chrome"))
				 {
					 driver=new ChromeDriver();
				 }
				 else if(BROWSER.equals("Firefox"))
				 {
					 driver=new FirefoxDriver();
				 }else if(BROWSER.equals("edge"))
				 {
					 driver=new EdgeDriver();
					 }else 
					{
				 driver=new SafariDriver();
					}
				 
				 // login to app
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 
				driver.get(URL);
				
				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				Thread.sleep(3000);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				Thread.sleep(3000);
				driver.findElement(By.id("submitButton")).click();
				Thread.sleep(3000);
				
				//navigate to organization module
				driver.findElement(By.linkText("Organizations")).click();
				Thread.sleep(3000);
				
				// click on create organization button
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				
				// enter all the details & create new organization
				driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(ORGNAME);
				driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
				Thread.sleep(3000);
				// sign out from app
				Actions act=new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
				act.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
				//closing browser
				driver.quit();

			}

}
