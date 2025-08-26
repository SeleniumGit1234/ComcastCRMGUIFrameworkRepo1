
package practiceTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void M2() throws InterruptedException
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
}



