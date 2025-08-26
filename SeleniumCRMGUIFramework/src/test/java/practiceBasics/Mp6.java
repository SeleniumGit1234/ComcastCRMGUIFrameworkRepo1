package practiceBasics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Mp6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript( "window.scrollBy(0,2000)");
			
		WebElement ele = driver.findElement(By.xpath("//input[contains(@id,'comboBox')]"));
		Thread.sleep(5000);
		ele.click();
		Actions act=new Actions(driver);
		WebElement ele3 = driver.findElement(By.xpath("(//div[contains(text(),'Item 10')])[1]"));
		act.scrollToElement(ele3);
		act.moveToElement(ele3).click().build().perform();
		Thread.sleep(5000);
		driver.quit(); 
	
	

	}

}
