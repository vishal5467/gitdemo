package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank44 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,800)");
	  click(specifieyourloaction, "successfully clicked on location");
	  Thread.sleep(3000);
	  driver.findElement(zipinput).sendKeys("02904");
	  Thread.sleep(7000);
	  click(submit2, "successfdully clicked on submiot");
	  Thread.sleep(5000);
	  JavascriptExecutor jp=(JavascriptExecutor)driver;
	  jp.executeScript("window.scrollBy(1000,0)");
	  Thread.sleep(2000);
	  click(borrowing, "successfully clicked on borrowing");
	  Thread.sleep(3000);
	  click(personalloan,"successfully clicked on personal loan");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,2600)");
	  click(learnmorehomeequity, "successfully clicked on home equity");
	   Thread.sleep(7000);
	   JavascriptExecutor jk=(JavascriptExecutor)driver;
	   jk.executeScript("window.scrollBy(0,2600)");
	   click(startnow1,"successfully clicked on start now");
	   
	   Set<String>windowhandle=driver.getWindowHandles();
	   String windoiw1=(String)windowhandle.toArray()[0];
	   String windiw2=(String)windowhandle.toArray()[1];
	   
	   driver.switchTo().window(windiw2);
	   Select vis=new Select(driver.findElement(whrehomelocated));
	   vis.selectByIndex(4);
	   driver.findElement(amountuwanttoborrow).sendKeys("20000");
	   
	   JavascriptExecutor jq=(JavascriptExecutor)driver;
	   jq.executeScript("window.scrollBy(0,500)");
	   
	   click(payoffcurrentradio, "successfully clicked on curent ");
	   click(calculate1, "successfully clickede on calculate");
	   
	   Thread.sleep(5000);
	   
  }
}
