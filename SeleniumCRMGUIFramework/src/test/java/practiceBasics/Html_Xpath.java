package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Html_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("yt-formatted-string")).below(By.xpath("yt-formatted-string[text()='Home']"))).click();
		Thread.sleep(20000);
		driver.quit();
	}

}
