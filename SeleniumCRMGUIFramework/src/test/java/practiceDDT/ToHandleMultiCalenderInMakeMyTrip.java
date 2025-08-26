package practiceDDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleMultiCalenderInMakeMyTrip {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		
		for(;;)
		{
		try
		{
		driver.findElement(By.xpath("//div[.='December 2025']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='1']")).click();
		
		break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}
		
		
		
		
		

	}

}
