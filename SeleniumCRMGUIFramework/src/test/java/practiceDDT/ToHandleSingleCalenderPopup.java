package practiceDDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToHandleSingleCalenderPopup {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='dojWrapper___cfd382']/span")).click();
		driver.findElement(By.xpath("//span[.='30']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
