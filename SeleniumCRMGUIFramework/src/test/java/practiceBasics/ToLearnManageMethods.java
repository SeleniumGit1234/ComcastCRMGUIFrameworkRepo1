package practiceBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximizinig window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//minimising window
		driver.manage().window().minimize();
		Thread.sleep(5000);
		//browser fullscreen
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		//set the size of the browser
		Dimension dim=new Dimension(200,300);
		driver.manage().window().setSize(dim);
		System.out.println("size of the browser"+dim);
		System.out.println("width of the browser"+dim.width);
		System.out.println("height of the browser"+dim.height);
		//get the size of the  browser
		Dimension dim2 = driver.manage().window().getSize();
		System.out.println(dim2);
		//set the position of the browser
		Point poin = new Point(300,300);
		System.out.println("get the position of the browser"+poin);
		System.out.println("get the x coordinate of the browser"+ poin.getX());
		System.out.println("get the y coordinate of the browser"+ poin.getY());
		//get the position of the browser
		System.out.println("get the size of the browser"+" "+driver.manage().window().getPosition().getX()+" "+driver.manage().window().getPosition().getY());
		Thread.sleep(5000);
		driver.quit();
		
		
		
		

	}

}
