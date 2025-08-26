package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocator_Name_attribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Pavani");
		driver.findElement(By.name("password")).sendKeys("palli.pavani");
		Thread.sleep(5000);
		driver.quit();

	}

}
