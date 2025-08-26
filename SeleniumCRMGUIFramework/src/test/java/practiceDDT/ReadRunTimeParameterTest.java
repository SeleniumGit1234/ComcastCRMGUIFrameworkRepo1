package practiceDDT;

import org.testng.annotations.Test;

public class ReadRunTimeParameterTest {

	@Test
	public void runtimeParameterTest() {
		
		//reading data from CMD line
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
	// displaying data on console
		System.out.println("Env Data==> url"+URL);
		System.out.println("browser Data==> browser"+BROWSER);
		System.out.println("username Data==> username"+USERNAME);
		System.out.println("password Data==> password"+PASSWORD);
		

	}

}
