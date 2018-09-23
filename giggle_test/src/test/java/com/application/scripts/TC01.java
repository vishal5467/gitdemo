package com.application.scripts;

import java.util.concurrent.TimeUnit;

import org.omg.PortableInterceptor.SUCCESSFUL;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC01 extends CommonPage{

	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the display of giggle logo
	 * @param
	 * @throws Throwable
	 */
	@Test
	public void testTC01() throws Throwable
	{
		boolean windopopup =isElementDisplayed(driver.findElement(popup));
		if (windopopup)
		{
			SuccessReport("verify popup display", "popup is displayed" );
			click(popup,"Window popup"); 
			
		} else 
		{
            failureReport("verify popup dispaly", "popup is not displayed");
            
		}
		boolean signinlink = isElementDisplayed(driver.findElement(singin));
		if (signinlink) 
		{
			SuccessReport("verify sign in button", "sign in button is displayed");
			
		} else 
		{
            failureReport("verify sign in button" ,"sign in button is not displayed");
		}
		Thread.sleep(20000);
		click(singin, "success clicked");
		
		boolean  windowsignwrite=isElementDisplayed(driver.findElement(windowsignin));
		if(windowsignwrite)
		{
			SuccessReport("verify sign in text","sign in text in ebable");
			 driver.findElement(windowsignin).sendKeys("vishalns24@gmail.com");
		}
		else 
		{
		failureReport("verify sign in text","sign in text is not enable");
		}
		
		boolean passwordlog= isElementDisplayed(driver.findElement(password));
		if (passwordlog) 
		{
		  SuccessReport("verify password", "successfully displayed");	
		 driver.findElement(password).sendKeys("asfsdgshg");
		} 
		else
		{
            failureReport("verify password","is not displayed" );
            
		}
		boolean signinwind=isElementDisplayed(driver.findElement(singin));
		if (signinwind)
		{
			SuccessReport("verify button","button is displayed");
			click(singin, "sign in clickes");
		} else 
			failureReport("verify sign in","sign in is not clicked" );
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		{

		}
		
	      
	}
	
}
