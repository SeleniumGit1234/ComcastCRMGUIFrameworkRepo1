package practiceDDT;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromTestNG {

	@Test
	
	public void SampleTest(XmlTest test) {
		
		System.out.println("execute TestNG");
		System.out.println(test.getParameter("url"));
		System.out.println(test.getParameter("browser"));
		System.out.println(test.getParameter("username"));
		System.out.println(test.getParameter("password"));
		
		
		

	}

}
