package practiceBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocator_LinkText3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Pavani");
		driver.findElement(By.id("LastName")).sendKeys("Palli");
		driver.findElement(By.name("Email")).sendKeys("Palli.Pavani@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pavani@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Pavani@1234");
	
		Thread.sleep(2000);
		driver.quit();
		
	}

}
