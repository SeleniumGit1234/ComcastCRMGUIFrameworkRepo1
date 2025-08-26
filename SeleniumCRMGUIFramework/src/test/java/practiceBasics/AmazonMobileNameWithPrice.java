package practiceBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobileNameWithPrice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String DATA=driver.findElement(By.xpath("//span[.='iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Desert Titanium']/../../../../div[1]")).getText();
		String Data=driver.findElement(By.xpath("//span[.='iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Desert Titanium']/following::div[4]/descendant::span[.='1,35,900']")).getText();
		System.out.println(DATA+"\t"+Data);
		driver.quit();
	}

}
