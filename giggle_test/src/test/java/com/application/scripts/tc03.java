package com.application.scripts;

import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class tc03 extends CommonPage
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
		
		boolean signinlink = isElementDisplayed(driver.findElement(singin));
		if (signinlink) 
		{
			SuccessReport("verify sign in button", "sign in button is displayed");
		} else 
		{
            failureReport("verify sign in button" ,"sign in button is not displayed");
		}
		
		             
		boolean txtserch=isElementPresent(txtSearchbox, "serch text box");
		if (txtserch)
		{
			SuccessReport("verify serch text box","Serch text box is displayed" );
			
			String strwatermark= getAttribute(txtSearchbox,"value","watermark is present");
			if (strwatermark.equalsIgnoreCase("Enter Keyword or Item #")) 
			{
				//without writing +strwatermark enter keyworld or item does not write in detail report se we need to write strwwatermark.
				SuccessReport("verifi watermark","water mark is same as displayed" +strwatermark );
			} else 
			{
                 failureReport("verifr watermark","water mark is not same as displayed" +strwatermark);
			}
			
			
		}
		else 
		{
			failureReport("verify serch text box", "serch text box is not displayed");

		}
		
	      
	}
	
}
