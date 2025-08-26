package practiceBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shoppersstack.com/products_page/17");
        Thread.sleep(20000);
        driver.findElement(By.id("compare")).click();
        String ParentID = driver.getWindowHandle();
        System.out.println(ParentID);
        Set<String> AllWindowID = driver.getWindowHandles();
        System.out.println(AllWindowID);
        AllWindowID.remove(ParentID);
        for(String window:AllWindowID)
        {
        
        	driver.switchTo().window(window);
        	driver.close();
        	Thread.sleep(2000);
        
        
	}
        driver.switchTo().window(ParentID);
        driver.close();
        
	}
}
