package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bs30 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(formember)).perform();
	  bar.moveToElement(driver.findElement(drug)).perform();
	  click(drug, "sucessfully cloicked om drug");
	  
	  Thread.sleep(8000);
	  JavascriptExecutor ju=(JavascriptExecutor)driver;
	  ju.executeScript("window.scrollBy(0,400)");
	  
	  click(bronze, "successfully cliked on bronze");
	  
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,400)");
	  
	  click(silvere, "successfully clicked");
	  
	  JavascriptExecutor jp=(JavascriptExecutor)driver;
	  jp.executeScript("window.scrollBy(0,600)");
	  
	  click(goldplan, "successfully clicked glod");
	  
	  Thread.sleep(6000);
	  
	  JavascriptExecutor ji=(JavascriptExecutor)driver;
	  ji.executeScript("window.scrollBy(0,200)");
	  
	  click(catastophic,"successfully clicked on csatastophic");
	  
	  Thread.sleep(7000);
  }
}
