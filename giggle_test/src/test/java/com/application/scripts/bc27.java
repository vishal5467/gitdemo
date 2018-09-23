package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc27 extends bcbs

{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(formember)).perform();
	  bar.moveToElement(driver.findElement(onlineaccount)).perform();
	  click(onlineaccount,"successfully clicked on online accoiunt");
	  Thread.sleep(9000);
	  
	  click(helthandwellness, "successfully clicked on helthandwellness");
	  Thread.sleep(8000);
	  
	  JavascriptExecutor jf=(JavascriptExecutor)driver;
	  jf.executeScript("window.scrollBy(0,2000)");
	  
	  click(styinghealthy, "successfully clicked on stying helthy");
	  Thread.sleep(9000);
	  
	  JavascriptExecutor jl=(JavascriptExecutor)driver;
	  jl.executeScript("window.scrollBy(0,500)");
	  click(depressonscreening,"successfully clikcked");
	  
	  JavascriptExecutor jg=(JavascriptExecutor)driver;
	  jg.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(7000);
	  click(nod1, "succesfully clicked");
	  Thread.sleep(8999);
	  click(nod2, "successfully clicked nod2");
	  
	  Thread.sleep(8000);
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,1000)");
	  
	  click(understandrisk, "successfully clickedcon risk");
	  
	  Thread.sleep(7000);
	  
	  
	  
	  
	  
	  
  }
}
