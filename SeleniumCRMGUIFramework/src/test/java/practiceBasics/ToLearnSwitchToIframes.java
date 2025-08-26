package practiceBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToIframes {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.dream11.com/");
			//switch into frame
			//frames using index
			//driver.switchTo().frame(0);
			//frames using name or id
			//driver.switchTo().frame("send-sms-iframe");
			//frames using web element
			WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
			driver.switchTo().frame(iframe);
			driver.findElement(By.id("regEmail")).sendKeys("6301718270");
			
			
			
			

	}

}
