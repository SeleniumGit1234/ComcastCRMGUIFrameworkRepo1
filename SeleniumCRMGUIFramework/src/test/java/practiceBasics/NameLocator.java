package practiceBasics;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NameLocator {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(20000);
			driver.findElement(By.name("username")).sendKeys("63017353450");
			Thread.sleep(20000);
			driver.findElement(By.name("password")).sendKeys("Pavs@143");
			Thread.sleep(20000);
			driver.quit();
		}

	}
