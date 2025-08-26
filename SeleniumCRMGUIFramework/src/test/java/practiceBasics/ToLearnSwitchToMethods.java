package practiceBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/20");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		String parentID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		allWindowID.remove(parentID);
		// closing each window
		for(String windowID:allWindowID)
		{
			driver.switchTo().window(windowID);
			Thread.sleep(2000);
			driver.close();
		} 
		driver.switchTo().window(parentID);
		driver.close();
	}

}
