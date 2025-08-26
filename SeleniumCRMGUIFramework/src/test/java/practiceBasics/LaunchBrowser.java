package practiceBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://google.com//");
Thread.sleep(2000);
driver.quit();


	}

}
