package practiceBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnCloseAndQuitMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.shoppersstack.com/products_page/24");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		
		
	}

}
