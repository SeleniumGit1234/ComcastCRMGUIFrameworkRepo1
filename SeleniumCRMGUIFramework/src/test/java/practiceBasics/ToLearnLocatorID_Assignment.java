package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocatorID_Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Pavani");
		driver.findElement(By.id("LastName")).sendKeys("Palli");
		driver.findElement(By.id("Email")).sendKeys("Palli.pavani@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Pavani Technologies");
		Thread.sleep(3000);
		driver.quit();

	}

}
