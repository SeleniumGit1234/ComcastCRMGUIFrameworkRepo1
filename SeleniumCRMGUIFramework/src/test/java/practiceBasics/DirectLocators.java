package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		driver.findElement(By.id("email")).sendKeys("630174657670");
		Thread.sleep(20000);
		driver.findElement(By.id("pass")).sendKeys("Pavs@143");
		Thread.sleep(20000);
		driver.quit();
	}

}
