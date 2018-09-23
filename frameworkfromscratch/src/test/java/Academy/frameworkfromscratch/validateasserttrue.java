package Academy.frameworkfromscratch;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.landingpage;
import pageobject.loginpage;
import resources.base;

public class validateasserttrue extends base
{
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initializedriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void assertionbbb() throws IOException
	{
	
	
	landingpage la=new landingpage(driver);
	
	
	//compare text from browser with actial valiy by client and web page
	Assert.assertEquals(la.gettitle().getText(),"FEATURED COURSES");
	//Assert.assertTrue(la.contactlink());
	
	
	
}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}