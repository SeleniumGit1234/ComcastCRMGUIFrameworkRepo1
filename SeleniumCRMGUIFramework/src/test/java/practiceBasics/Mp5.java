package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mp5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		Thread.sleep(3000);
		act.moveToElement(ele).click().build().perform();
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.linkText("Men's Top Wear"));
		act.moveToElement(ele2).build().perform();
		Thread.sleep(5000);
		WebElement ele3 = driver.findElement(By.linkText("Men's T-Shirts"));
		act.moveToElement(ele3).click().build().perform();
		Thread.sleep(5000);
		


	}




	}


