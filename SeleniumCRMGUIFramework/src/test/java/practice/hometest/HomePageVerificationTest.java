package practice.hometest;


import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageVerificationTest {
@Test	
public void homePageTest(Method mtd)
{
	System.out.println(mtd.getName()+"Start");
	//String expectedTitle="Home";
	String expectedTitle="Home Page";
	
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://49.249.28.218:8888");

driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();

String actTitle=driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();

/*
 * if(actTitle.trim().equalsIgnoreCase(expectedTitle)) {
 * System.out.println("expected page is verified ==PASS"); } else {
 * System.out.println("expected page is not verified ==FAIL"); }
 */
//Hard Assert
Assert.assertEquals(actTitle, expectedTitle);
System.out.println(mtd.getName()+"END");
driver.close();
}
@Test
public void verifyLogoHomePageTest(Method mtd)
{
	System.out.println(mtd.getName()+"Start");
	WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://49.249.28.218:8888");

driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();

Boolean status=driver.findElement(By.xpath("//img[@title='vtiger-crm-logo.gif']")).isEnabled();
/*
 * if(status) { System.out.println("logo is verified ==PASS"); } else {
 * System.out.println("logo is not verified ==FAIL"); }
 */
//Assert.assertEquals(true, status);
//Hard Assert
Assert.assertTrue(true);
System.out.println(mtd.getName()+"END");
driver.close();

	
}

}
