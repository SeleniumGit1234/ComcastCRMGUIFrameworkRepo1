package practiceBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mp4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.clinique.in/");
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.linkText("Skincare"));
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//button[contains(@aria-label,'Close')][1]")).click();
		Thread.sleep(5000);
		WebElement va2 = driver.findElement(By.xpath("//iframe[@name='ibmOptinFrame']"));
		driver.switchTo().frame(va2);
		Thread.sleep(2000);
		WebElement va = driver.findElement(By.xpath("//button[@id='dismissBtn']"));
		va.click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.linkText("Skincare"));
		Thread.sleep(5000);
		ele2.click();
		Thread.sleep(5000);
		Select sel=new Select(ele2);
		List<WebElement> allOptions = sel.getOptions();
		Thread.sleep(3000);
		for(WebElement value:allOptions)
		{
		
		 System.out.println(value.getText());
		 
		}
		driver.quit();

	}

}
