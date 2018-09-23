package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc25 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(helthinsurance101)).perform();
	  bar.moveToElement(driver.findElement(selectrightplan)).perform();
	  click(selectrightplan, "successfully clicked on right plan");
	  
	  JavascriptExecutor jg=(JavascriptExecutor)driver;
	  jg.executeScript("window.scrollBy(0,500)");
	  click(choosingowninsurance, "successfully clicked");
	  
	  Thread.sleep(5000);
	  
	  
  }
}
