package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank37 extends bank
{
  @Test
  public void f() throws Throwable 
  {
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
	  click(homemortage1, "successfully clicked on homemortage1");
	  Thread.sleep(6000);
	  
	  JavascriptExecutor jf=(JavascriptExecutor)driver;
	  jf.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(4000);
	  
	  click(adjustablerate, "successfully clicked on adjustable rate");
	  Thread.sleep(3000);
	  click(seconguparrow,"successfully clicked on second up aerrow");
	  Thread.sleep(3000);
	  click(closesecondupaerrow,"successfully clickled on second up aerrow");
	  click(getstert,"successfully clicked on getstarted");
	  Thread.sleep(8000);
  }
}
