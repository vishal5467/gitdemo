package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank36 extends bank
{
  @Test
  public void f() throws Throwable  
  {
	 // Thread.sleep(5000);
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,800)");
	  click(specifieyourloaction, "successfully clicked on location");
	  
	  driver.findElement(zipinput).sendKeys("02904");
	  click(submit2, "successfdully clicked on submiot");
	  
	  JavascriptExecutor jp=(JavascriptExecutor)driver;
	  jp.executeScript("window.scrollBy(1000,0)");
	  Thread.sleep(2000);
	  
	 
	  
	  click(borrowing, "successfully clicked on borrowing");
	  Thread.sleep(3000);
	  
	  click(subborrowing, "successfully clicked on sub vorrowing");
	  Thread.sleep(7000);
	  click(homemortage, "successfully clicked on homemortage");
	  Thread.sleep(7000);
	  JavascriptExecutor jt=(JavascriptExecutor)driver;
	  jt.executeScript("window.scrollBy(0,600)");
	  click(uparo, "successfuly clicked on up arrow");
	  click(closeuparo,"successfully clicked on close aeroeww");
	  Thread.sleep(8000);
	  click(getstert,"successfully clicked on getstarted");
	  Thread.sleep(8000);
	  
  }
}
