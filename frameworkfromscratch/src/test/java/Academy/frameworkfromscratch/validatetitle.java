package Academy.frameworkfromscratch;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobject.landingpage;
import resources.base;

public class validatetitle extends base
{
	public static Logger log =LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void setup() throws IOException
	{
		driver=initializedriver();
		
		log.info("driver is initialize");
		driver.get(prop.getProperty("url"));
	 log.info("navigate to home page");
	}
	@Test
	public void basepag() throws IOException 
	{
	driver=initializedriver();
	driver.get(prop.getProperty("url"));
	
	landingpage la=new landingpage(driver);
	
	
	//compare text from browser with actial valiy by client and web page
Assert.assertTrue(la.contactlink().isDisplayed());
	log.info("successfully validated text messavge");
	
	
}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}