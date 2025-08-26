package practiceBasics;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Mp8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.clinique.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@aria-label,'Close')][1]")).click();
		Thread.sleep(5000);
		WebElement va2 = driver.findElement(By.xpath("//iframe[@name='ibmOptinFrame']"));
		driver.switchTo().frame(va2);
		Thread.sleep(2000);
		WebElement va = driver.findElement(By.xpath("//button[@id='dismissBtn']"));
		va.click();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("(//*[local-name()='svg' and @class='header-secondary-links-icon'])[3]")).click();
		Thread.sleep(3000);
		driver.quit();
			

	}

}
