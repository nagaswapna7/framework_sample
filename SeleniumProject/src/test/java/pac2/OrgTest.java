package pac2;

import org.testng.annotations.Test;

public class OrgTest
{
	@Test(groups = "SmokeTest")
	public void createOrgTest()
	{String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	
	System.out.println("url is: "+URL);
	System.out.println("browser is: "+BROWSER);
	System.out.println("username is: "+USERNAME);
	System.out.println("password is: "+PASSWORD);
		System.out.println("Execute create Org test");
	}
	
	@Test(groups = "RegressionTest")
	public void modifyOrgTest()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println("url is: "+URL);
		System.out.println("browser is: "+BROWSER);
		System.out.println("username is: "+USERNAME);
		System.out.println("password is: "+PASSWORD);
		System.out.println("Execute modify org test");
	}
}
