package practiceBasics;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class SubmitMethod {
			public static void main(String[] args) throws InterruptedException {
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//input[@name='username'])")).sendKeys("Pavani");
				Thread.sleep(20000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fgfjhgjhgj");
				Thread.sleep(20000);
				
//				driver.quit();
//				
//				
//
//			}
//
//		
//	}


