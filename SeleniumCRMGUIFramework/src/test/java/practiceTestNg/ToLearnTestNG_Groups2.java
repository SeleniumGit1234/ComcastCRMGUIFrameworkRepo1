package practiceTestNg;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	public class ToLearnTestNG_Groups2 {

	 @Test(groups = "SmokeTest")
			public void M1() throws InterruptedException
			{
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(3000);
			    WebElement loginObj = driver.findElement(By.linkText("Log in"));
			    loginObj.click();
			    Thread.sleep(3000);
			    WebElement logInRef = driver.findElement(By.xpath("//input[@value='Log in']"));
			    logInRef.click();
				Thread.sleep(3000);
				driver.quit();
		}
	 @Test(groups = "RegressionTest")
			public void M4() throws InterruptedException{
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


