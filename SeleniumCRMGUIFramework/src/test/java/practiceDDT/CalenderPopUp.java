package practiceDDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.findElement(By.xpath("//div[.='From']")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//div[.='Visakhapatnam']")).click();
		 
		 Thread.sleep(10000); 
		 WebElement ELE2 = driver.findElement(By.xpath("//div[.='To']"));
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.elementToBeClickable(ELE2));
		 ELE2.click();
		 Thread.sleep(5000);
		 WebElement ELE3=driver.findElement(By.xpath("//div[.='Hyderabad']")); 
		 
		 Actions  act2=new Actions(driver);
		 act2.moveToElement(ELE3).click().perform();
		 
		
		driver.findElement(By.xpath("//span[text()='Date of Journey']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Date picker']/descendant::span[.='30']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='primaryButton___469d04 searchButtonWrapper___12ed9c ']")).click();
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//div[.='Price: Lowest First']")).click();
		Thread.sleep(5000);
			
		driver.quit();
		
		

	}

}
