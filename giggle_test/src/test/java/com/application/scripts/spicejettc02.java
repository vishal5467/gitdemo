package com.application.scripts;

import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;
import com.objectRepository.CommonPage;
import com.objectRepository.spicejet;

public class spicejettc02 extends spicejet
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
	  String adultdrop=getText(adultdropdown, "text is");
	  if (adultdrop.contains("1 Adult")) 
	  {
		SuccessReport("verify test", "text is '"+adultdrop+"' displayed");
	} else 
	{
         failureReport("verify test", "text is not '"+adultdrop+"' displayed");
	}
		
		
	}
}
