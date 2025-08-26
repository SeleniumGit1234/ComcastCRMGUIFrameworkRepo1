package practiceBasics;
		import java.time.Duration;
		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;
		public class MockTest7 {
			public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://testautomationpractice.blogspot.com/");
				
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript( "window.scrollBy(0,1500)");
				driver.findElement(By.xpath("//input[@id='singleFileInput']")).click();
				Thread.sleep(3000);
				

	}

}
