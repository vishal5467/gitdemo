package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc20 extends  bcbs
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(groupplan)).perform();
	  click(groupplan, "successfully clicked on group plan");
	  
	  Actions bar1=new Actions(driver);
	  bar1.moveToElement(driver.findElement(help)).perform();
	  bar1.moveToElement(driver.findElement(contactus1)).perform();
	  click(contactus1, "successfully clicked on contact us");
	  Thread.sleep(8000);
	  click(plaus1,"successfully clickec on plus1");
	  Thread.sleep(8000);
	  click(plus2, "successfully clicked on plus2");
	  
	  Thread.sleep(6000);
	  
	  JavascriptExecutor jk=(JavascriptExecutor)driver;
	  jk.executeScript("window.scrollBy(0,1000)");
	  
	  click(feedback, "successfully lcikd omn feed back");
	  
	  
  }
}
