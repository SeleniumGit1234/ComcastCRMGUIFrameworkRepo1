package practiceBasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle_Url_PageSource {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("title of the webpage"+title);
	
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url of the page"+currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println("source code of the page"+pageSource);
		driver.quit();

	}

}
