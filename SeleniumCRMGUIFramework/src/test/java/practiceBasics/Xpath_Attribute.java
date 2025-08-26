	package practiceBasics;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.Set;

	public class Xpath_Attribute {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Log in")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			String errormsg = driver.findElement(By.xpath("//span[contains(text(),'Login ')]")).getText();
			System.out.println(errormsg);
			driver.quit();
		}

		


}


