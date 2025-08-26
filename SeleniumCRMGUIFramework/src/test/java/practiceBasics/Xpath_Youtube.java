	package practiceBasics;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.Set;

	public class Xpath_Youtube {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("search_query")).sendKeys("NTR songs");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Chuttamalle | Devara Second Single | NTR ')]")).click();
			Thread.sleep(20000);
			driver.quit();
		}

	}


