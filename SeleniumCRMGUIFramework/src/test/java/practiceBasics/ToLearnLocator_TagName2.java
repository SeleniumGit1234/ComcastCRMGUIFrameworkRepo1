package practiceBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocator_TagName2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
	System.out.println("total links on amazon page is "+totalLinks.size());
	Thread.sleep(2000);
	driver.quit();
	

	}

}
