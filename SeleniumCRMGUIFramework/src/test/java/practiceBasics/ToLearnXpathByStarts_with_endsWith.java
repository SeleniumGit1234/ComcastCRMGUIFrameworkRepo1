package practiceBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByStarts_with_endsWith {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
    WebElement loginObj = driver.findElement(By.linkText("Log in"));
    loginObj.click();
    Thread.sleep(3000);
    WebElement logInRef = driver.findElement(By.xpath("//input[@value='Log in']"));
    logInRef.click();
	Thread.sleep(3000);
	WebElement textRef = driver.findElement(By.xpath("//span[starts-with(text(),'Login ')]"));
	System.out.println(textRef.getText());
	Thread.sleep(3000);
	//ends-with will not work
	//WebElement textRef = driver.findElement(By.xpath("//span[ends-with(text(),' Please correct the errors and try again.')]"));
	//System.out.println(textRef.getText());
	//Thread.sleep(3000);
	
	driver.quit();
}

}
