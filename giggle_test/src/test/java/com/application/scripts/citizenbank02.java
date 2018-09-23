package com.application.scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank02 extends bank {
  @Test
  public void f() throws Throwable 
  {
	//  Actions bar=new Actions (driver);
		//bar.moveToElement(driver.findElement(bankcredit)).perform();
		click(bankcredit,"successfully clciked bank credit");
		click(subbankandcredit, "successfully subclicked bank and credit");
		
		String bankcredittext1=driver.findElement(bankcredittext).getText();
		
			if (bankcredittext1.equalsIgnoreCase("Banking and Credit Cards"))
			{
				SuccessReport("verify text","text name is'"+bankcredittext1+"'");
			} else {
              failureReport("verify text","text name is not'"+bankcredittext1+"'");
			}
		

  }
}
