package practiceDDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SampleDDTClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\OneDrive\\Documents\\Desktop\\CommonData.properties");
		Properties prop= new Properties();
		prop.load(fis);
		
		String BROWSER=prop.getProperty("browser");
		String URL=prop.getProperty("url");
		String USERNAME=prop.getProperty("username");
		String PASSWORD=prop.getProperty("password");
		
		//System.out.println(BROWSER);
		//System.out.println(URL);
		
		
		/*
			Scanner s=new Scanner(System.in); 
			System.out.println("Browser"); 
			String browser=s.next();
			 System.out.println(browser);
		 */
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
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(URL);
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		Thread.sleep(3000);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(3000);
		driver.quit();
		
			}
}