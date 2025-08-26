package practiceDDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleMultiCalenderWithIRCTC {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(Options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.irctc.co.in/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
			driver.findElement(By.xpath("//span[@class='ng-tns-c59-10 ui-calendar']")).click();
			
			
			 for(;;) {
				 try
				 //{ driver.findElement(By.xpath("//div[text()='December 2025']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='1']")).click();
				 break; 
				 } 
				 catch(Exception e) 
				 {
					 driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c59-10']")).click(); } }
			 		Thread.sleep(3000);
			 		driver.quit();

	}

}
