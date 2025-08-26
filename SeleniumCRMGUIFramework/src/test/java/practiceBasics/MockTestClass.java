package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MockTestClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://candymapper.com/");
		driver.findElement(By.xpath("//*[local-name()='svg' and @width='28']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		WebElement ele = driver.findElement(By.xpath("//select[@name='tCounty']"));
		Thread.sleep(5000);
		ele.click();
		Select sel=new Select(ele);
        sel.selectByIndex(1);
        Thread.sleep(5000);
        driver.quit();
		

	}

}
