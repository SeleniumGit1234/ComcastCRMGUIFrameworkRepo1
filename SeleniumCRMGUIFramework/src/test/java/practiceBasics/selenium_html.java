package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_html {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Selenium%20new/SeleniumPage.html");
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("Pavani");
		Thread.sleep(20000);
		driver.findElement(By.id("lname")).clear();
		driver.findElement(By.id("lname")).sendKeys("Palli");
		Thread.sleep(20000);
		driver.quit();
		
		

	}

}
