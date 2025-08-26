package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByIndex {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bigbasket.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("")).click();
			Thread.sleep(10000);
			driver.quit();

	}

}
