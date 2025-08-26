package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MP3 {

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
		act.scrollByAmount(0, 300);
		WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'Alerts')]"));
		Thread.sleep(3000);
		act.moveToElement(ele2).click().build().perform();
		act.scrollByAmount(0, 300);
		Thread.sleep(5000);
		WebElement ele3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		Thread.sleep(5000);
		act.scrollByAmount(0, 300);
		act.moveToElement(ele3).click().build().perform();
		Thread.sleep(5000);
		
		driver.switchTo().alert().sendKeys("Pavani");
		Thread.sleep(5000);
		act.scrollByAmount(0, 300);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
