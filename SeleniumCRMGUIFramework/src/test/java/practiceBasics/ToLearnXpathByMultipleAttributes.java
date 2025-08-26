package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByMultipleAttributes {

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement textRef = driver.findElement(By.xpath("//input[@type='button' and @value='Vote']"));
		textRef.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
