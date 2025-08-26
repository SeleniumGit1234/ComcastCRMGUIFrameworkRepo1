package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathBySurroundings1 {

	public static void main(String[] args) throws InterruptedException {
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
