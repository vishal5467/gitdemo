package com.application.scripts;

import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;
import com.objectRepository.CommonPage;
import com.objectRepository.spicejet;

public class tc04 extends spicejet
{

	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the display of giggle logo
	 * @param
	 * @throws Throwable
	 */
	@Test
	public void testTC01() throws Throwable
	{
		boolean logodisplayed=isElementDisplayed(driver.findElement(verifylogo));
		if (logodisplayed) 
		{
		  SuccessReport("verifylogo","logo is displayed" );	
		}
		else 
		{
           failureReport("verify logo","logo is not displayed" );
		}
	}
}
