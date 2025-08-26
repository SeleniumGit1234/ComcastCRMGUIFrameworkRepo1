package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnYouTubeSong{

	public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.youtube.com/");
	 Thread.sleep(5000);
	 driver.findElement(By.name("search_query")).sendKeys("ntr songs");
	 Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@title='Search' and @aria-label='Search' and @class='ytSearchboxComponentSearchButton' ]")).click();
	 Thread.sleep(5000);
	driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Full Video: Chuttamalle')]")).click();
	Thread.sleep(30000);
	driver.quit();
	 
	 
	

	}

}
