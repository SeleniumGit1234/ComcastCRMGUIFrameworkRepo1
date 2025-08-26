package practiceDDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToHandleMultipleCalenderWithKSRTC {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ksrtc.in/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='tab-icon']"));
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",ele);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='departDate']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/ancestor::div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::a[.='13']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
