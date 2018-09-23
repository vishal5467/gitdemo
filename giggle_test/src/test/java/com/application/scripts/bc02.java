package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc02 extends bcbs
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(indiv)).perform();
	  click(indiv, "successfuly lcicked indi");
//	  
//	  String pop=driver.findElement(popup).getText();
//	  if (pop.equalsIgnoreCase("Click to close.")) 
//	  {
//		SuccessReport("verify text","successfully clicked'"+pop+"'" );
//	} else {
//         failureReport("verify text","successfully not clicked'"+pop+"'" );
//	}
//	  click(popup, "successfully lcicked popup");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,500)");
	  
	  
	  click(jobloss, "successfully clciked on jobloss");
	  
	  String jobloss1=driver.findElement(joblosstext).getText();
	  
	  if (jobloss1.equalsIgnoreCase("Qualifying Life Event")) 
	  {
		SuccessReport("verify text","text is '"+jobloss1+"'");
	} else {
        failureReport("verify text","text is not '"+jobloss1+"'");
	}
	  Thread.sleep(5000);
  }
}
