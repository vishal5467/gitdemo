package com.application.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

import com.accelerators.ActionEngine;
import com.objectRepository.CommonPage;
import com.objectRepository.spicejet;

public class spicejettco1 extends spicejet
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
		boolean adondis= isElementDisplayed(driver.findElement(addon));
		if (adondis) 
		{
			SuccessReport("verify addon","successfully onaddon" );
			Actions bar=new Actions(driver);
			bar.moveToElement(driver.findElement(addon)).perform();
			boolean rootmagazin =isElementDisplayed(driver.findElement(spiceroot));
			bar.moveToElement(driver.findElement(spiceroot)).perform();
			if (rootmagazin)
			{
				SuccessReport("verify root","successfully on rootbutton");
				boolean junemonth=isElementDisplayed(driver.findElement(jun));
				if (junemonth) 
				{
					SuccessReport("verify june", "successfully on june");
					click(jun, "success fully clicked");
				} else 
				{
	               failureReport("verify on june","not in june" );
				}
			} else 
			{
	             failureReport("verigy addon","successfully is not on addon" );
			}
			} else
			{
                failureReport("verify root", "not in rootbutton");
			}
			
		
            
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
}
