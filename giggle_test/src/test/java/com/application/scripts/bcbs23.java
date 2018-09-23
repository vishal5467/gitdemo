package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bcbs23 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions vishal=new Actions (driver);
	  vishal.moveToElement(driver.findElement(helthinsurance101)).perform();
	  vishal.moveToElement(driver.findElement(basic)).perform();
	  click(basic, "successfully clickedcon basic");
	  
	  Thread.sleep(6000);
	  
	 // click(lernmore,"successfully clicked on learn mnore");
	  
	  JavascriptExecutor jg=(JavascriptExecutor)driver;
	  jg.executeScript("window.scrollBy(0,500)");
	  
	  click(typesofplan, "successfully clickec ontypes of plan");
	  
	  
	  Thread.sleep(6000);
	  
	  JavascriptExecutor jh=(JavascriptExecutor)driver;
	  jh.executeScript("window.scrollBy(0,800)");
	  
	  click(differeceplan,"successfully bclicked on difference plan");
	  
	  click(veiwallcontact, "successfully clicked on all contact");
	  
	  JavascriptExecutor jl=(JavascriptExecutor)driver;
	  jl.executeScript("window.scrollBy(0,800)");
	  
	  click(ppo,"successfully clicked opn ppo");
	  
	  Thread.sleep(6000);
	  
	  click(idppo, "successfully clicke n ppo");
	  
	  
  }
  
}
