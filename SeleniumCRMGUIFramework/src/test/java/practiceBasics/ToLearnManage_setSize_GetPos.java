package practiceBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnManage_setSize_GetPos {

	public static void main(String[] args) throws InterruptedException {
		// launching the browser
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();	
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	
	//set the size of the browser
	//Dimension sizeOfBrowser= new Dimension(500, 500);
	//driver.manage().window().setSize(sizeOfBrowser);
	//driver.manage().window().setSize(new Dimension(700, 700));
	//get the position
	System.out.println("Before maximizing");
	 Point pos = driver.manage().window().getPosition();
	System.out.println("Position of the browser is"+pos);
	System.out.println("x coordinate:"+pos.getX());
	System.out.println("y coordinate:"+pos.getY());
	driver.manage().window().maximize();
	System.out.println("after maximizing");
	System.out.println("x coordinate "+driver.manage().window().getPosition().getX());
	System.out.println("y coordinate "+driver.manage().window().getPosition().getY());
	Thread.sleep(5000);
	//set the browser position
	driver.manage().window().setPosition(new Point(-100,-100));
	Thread.sleep(5000);
	driver.quit();
		
	}
}