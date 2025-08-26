package practiceDDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleMultipleCalenderPopup {

	public static void main(String[] args) {
	
		String MonthAndYear="December 2025";
		String Date= "30";
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(Options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.goibibo.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//span[@role='presentation']")).click();
			driver.findElement(By.xpath("//span[.='Departure']")).click();
			
			for(;;)
			{
				try
				{
					
					driver.findElement(By.xpath("//div[.= '"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+Date+"']")).click();
					break;
			
				}
				catch(Exception e)
				{
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				}
			}
	}
}

