package practiceBasics;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingParticularWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/17");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		String parentID = driver.getWindowHandle();
		Set<String> allWindowIDS = driver.getWindowHandles();
		allWindowIDS.remove(parentID);
		for(String window:allWindowIDS)
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
		     if(title.contains("Amazon"))
		     {
		    	 driver.close();
		    	 Thread.sleep(2000);
		    	 
		}
		     driver.switchTo().window(parentID);
		     driver.close();
		}
		
		
		

	}

}
