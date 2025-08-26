package practiceBasics;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.util.Set;

		public class Multiple_xpath {
			
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
				driver.findElement(By.linkText("Log in")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys("palli.pavani@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("Password")).sendKeys("tjghkjlkj");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				Thread.sleep(2000);
				driver.quit();
			}
		}
		