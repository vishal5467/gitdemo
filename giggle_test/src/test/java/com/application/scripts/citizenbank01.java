package com.application.scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank01 extends bank
{
  @Test
  public void f() throws Throwable
  {
	  String banktex= driver.findElement(bankte).getText();
	  if (banktex.equalsIgnoreCase("Citizens Bank - regionalization")) 
	  {
		SuccessReport("verify text","text is display'"+banktex+"'");
	} else {
		failureReport("verify text","text is not display'"+banktex+"'");
		
		
		
		

	}
  }
}
