package practiceBasics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigateMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		//launching the empty browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate methods
		Navigation nav=driver.navigate();
		nav.to("https://www.youtube.com/");
		Thread.sleep(2000);
		nav.to(new URL("https://www.amazon.in/"));
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(5000);
		driver.quit();
	}

}
