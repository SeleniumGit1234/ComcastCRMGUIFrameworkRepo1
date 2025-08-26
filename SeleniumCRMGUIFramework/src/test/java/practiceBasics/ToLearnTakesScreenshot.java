package practiceBasics;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTakesScreenshot {

	public static void main(String[] args) throws Throwable {
		
		// reading data from property file
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		FileInputStream fis=new FileInputStream("physical file path");
		Properties prop=new Properties();
		prop.load(fis);
		prop.getProperty("browser");
		
		

	}

}
