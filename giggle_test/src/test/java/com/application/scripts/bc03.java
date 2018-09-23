package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc03 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(indiv)).perform();
	  click(indiv, "successfuly lcicked indi");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,500)");
	  
	  click(marriage, "successfully clciked marriage");
	  String marrriage1=driver.findElement(marriagetext).getText();
	  if (marrriage1.equalsIgnoreCase("Marriage Qualifying Life Event"))
	  {
		SuccessReport("verify text","text is '"+marrriage1+"'");
	} else {
       failureReport("verify text","text is not '"+marrriage1+"'");
	}
  }
}
