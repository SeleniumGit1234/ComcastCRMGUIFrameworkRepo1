package com.crm.generic.baseutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void configBS()
	{
	
		System.out.println("Establish DB,report configuration");
	}
	
	@BeforeClass
	public void configBC()
	{
	
		System.out.println("launch browser");
	}
	@BeforeMethod
	public void configBM()
	{
		System.out.println("login");
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("logout");
		
	}
	
	@AfterClass
	public void configAC()
	{
	
		System.out.println("close browser");
	}

	@AfterSuite
	public void createcontactT()
	{
	
		System.out.println("closeDB,report backup");
	}
	

}
