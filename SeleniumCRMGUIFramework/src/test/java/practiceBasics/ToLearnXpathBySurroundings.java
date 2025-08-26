package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathBySurroundings {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[text()='Very bad']/..//input[@name='pollanswers-1']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("vote-poll-1")).click();
			Thread.sleep(3000);
			driver.quit();	

	}

}
