package practiceBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnManage_setSize_GetPos_SetPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(5000);
	driver.quit();
	
	
	}
}
