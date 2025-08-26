package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ToLearnRelativeLocator {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(3000);
		    WebElement wishObj = driver.findElement(By.xpath("//input[@value='Search']"));
		   	Thread.sleep(3000);
		    WebElement Ref = driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(wishObj));
		    Ref.sendKeys("Books");
		    wishObj.click();
		    Thread.sleep(3000);
		    driver.quit();

	}

}

