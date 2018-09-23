package Academy.frameworkfromscratch;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.landingpage;
import pageobject.loginpage;
import resources.base;

public class Homepage extends base 
{
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initializedriver();
		log.info("navigate to home page");
		
	}
	@Test(dataProvider="getdata")
	public void basepagenavigation(String username, String password, String text) throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		landingpage la=new landingpage(driver);
		la.getlogin().click();
		
		log.info("successfully click message");
		
		loginpage lg=new loginpage(driver);
		lg.username().sendKeys(username);
		lg.pass().sendKeys(password);
		System.out.println(text);
		 lg.logbutton().click();
		
		
	}
	@DataProvider
	public Object[][] getdata()
	{
		return new Object[][]
				{
			
			new Object[]{"vishal","12333","valid"},
			new Object[]{"vishal1","467477", "invalid"}
				};//we need to give ; extra at the end
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
