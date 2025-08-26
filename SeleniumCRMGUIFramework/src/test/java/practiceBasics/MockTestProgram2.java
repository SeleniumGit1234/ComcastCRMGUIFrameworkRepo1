package practiceBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MockTestProgram2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
		Thread.sleep(10000);
		Actions act=new Actions(driver);	
		act.scrollToElement(ele).build().perform();
		Thread.sleep(5000);
		act.scrollByAmount(0, 300);
		Thread.sleep(5000);
		act.moveToElement(ele).click().build().perform();
		Thread.sleep(5000);
		WebElement eleBrowser = driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]"));
		Thread.sleep(5000);		
		act.scrollByAmount(0, 300);
		act.moveToElement(eleBrowser).click().build().perform();
		Thread.sleep(5000);	
		WebElement eleMessage = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		Thread.sleep(5000);
		act.scrollByAmount(0, 300);
		act.moveToElement(eleMessage).click().build().perform();
		Thread.sleep(5000);
		
		String parentID = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		allwindows.remove(parentID);
		for(String window:allwindows)
		{
		driver.switchTo().window(window);
		driver.close();
		}
		driver.switchTo().window(parentID);
		Thread.sleep(3000);
		driver.quit();
	}


}

	
		
	


