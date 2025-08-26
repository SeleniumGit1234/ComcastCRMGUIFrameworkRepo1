package practiceTestNg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel4 {
	@Test
	public void M4() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/20");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println("all window IDS"+allWindowID);
		driver.quit();
		
		}
		}