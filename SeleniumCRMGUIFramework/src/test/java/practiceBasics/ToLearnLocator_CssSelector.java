package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocator_CssSelector {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("Mobiles");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[value='Search']")).click();
	Thread.sleep(3000);
	driver.quit();
	

	}

}
