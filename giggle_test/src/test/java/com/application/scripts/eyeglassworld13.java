package com.application.scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld13 extends eyeglass 
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(offer)).perform();
	  bar.moveToElement(driver.findElement(samedayservice)).perform();
	  click(samedayservice, "successfully clicked");
	  String sameday=getText(samedaytexe,"name is" );
	  if (sameday.equalsIgnoreCase("Same Day Glasses at Eyeglass World")) 
	  {
		SuccessReport("verify text","text is enable'"+sameday+"'");
	} else {
          failureReport("verify text","text is not disable'"+sameday+"'");
	}
  }
}
