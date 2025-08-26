package practiceTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	public void M3() throws InterruptedException
	{
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
	    WebElement WishObj = driver.findElement(By.xpath("//span[text()='Wishlist']"));
	    WishObj.click();
	    Thread.sleep(3000);
	  	WebElement textRef = driver.findElement(By.xpath("//div[contains(text(),'wishlist ')]"));
		System.out.println(textRef.getText());
		driver.quit();

}
}
