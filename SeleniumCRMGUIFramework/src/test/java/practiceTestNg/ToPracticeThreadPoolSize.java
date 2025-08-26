package practiceTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToPracticeThreadPoolSize {
	
	@Test(invocationCount= 10, threadPoolSize = 5)
	public void login() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//Enter un and pwd
		Reporter.log("logged is successfully",true);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
