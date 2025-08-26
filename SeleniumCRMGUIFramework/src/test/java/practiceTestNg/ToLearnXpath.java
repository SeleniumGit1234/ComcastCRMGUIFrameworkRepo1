package practiceTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearnXpath {
 @Test
		public void M1() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(3000);
		    WebElement loginObj = driver.findElement(By.linkText("Log in"));
		    loginObj.click();
		    Thread.sleep(3000);
		    WebElement logInRef = driver.findElement(By.xpath("//input[@value='Log in']"));
		    logInRef.click();
			Thread.sleep(3000);
			driver.quit();
	}
 @Test
		public void M4() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='30' and @id='fiv_3_30/04/2025']/..//div[@class='month2' and text()='Apr 2025']"));
		Thread.sleep(3000);
		driver.quit();
		
				

	}

}


