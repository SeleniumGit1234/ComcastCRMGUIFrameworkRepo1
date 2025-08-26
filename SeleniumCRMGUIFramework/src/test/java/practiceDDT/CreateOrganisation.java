package practiceDDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class CreateOrganisation {

	public static void main(String[] args) throws IOException, InterruptedException{
					
			FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\Pavani\\CommonData.properties");
			
			Properties prop= new Properties();
			prop.load(fis);
			
			String BROWSER=prop.getProperty("browser");
			String URL=prop.getProperty("url");
			String USERNAME=prop.getProperty("username");
			String PASSWORD=prop.getProperty("password");
			
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
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			driver.get(URL);
			
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			Thread.sleep(3000);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			Thread.sleep(3000);
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Organizations")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("facebook2");
			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
			Thread.sleep(3000);
			Alert alet=driver.switchTo().alert();
			alet.accept();
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
			act.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
			driver.quit();

		}

	}

