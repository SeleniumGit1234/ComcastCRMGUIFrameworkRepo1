package practiceTestNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestForScreenshot {
	
	@Test
	public void amazonTest() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//step-1: create an object to upcasting the WebDriver object to TakesScreenshot object
		TakesScreenshot tks= (TakesScreenshot) (driver);
		//use getScreenShotAs method to get file type of screenshot
		File srcFile=tks.getScreenshotAs(OutputType.FILE);
		//store file to locat system
		FileUtils.copyFile(srcFile, new File("./Screenshot/test.png"));
				
	}

}
