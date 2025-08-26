package practiceTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parrell1 {
	@Test
	public void M1() throws InterruptedException
	{
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobiles");
    Thread.sleep(3000);
  driver.findElement(By.xpath("//input[@id='small-searchterms']/following-sibling::input")).click();
  Thread.sleep(3000);
  driver.quit();
	}
  

}
