package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc26 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(formember)).perform();
	  bar.moveToElement(driver.findElement(onlineaccount)).perform();
	  click(onlineaccount,"successfully clicked on online accoiunt");
	  Thread.sleep(9000);
	  click(registernowon, "successfully clicked on register");
	  
	  Set<String>windowhandle=driver.getWindowHandles();
	  String window1=(String)windowhandle.toArray()[0];
	  String window2=(String)windowhandle.toArray()[1];
	  
	  driver.switchTo().window(window2);
	  Thread.sleep(10000);
	  
	  JavascriptExecutor jh=(JavascriptExecutor)driver;
	  jh.executeScript("window.scrollBy(0,500)");
	  
	  driver.findElement(firstname).sendKeys("vishal");
	  driver.findElement(lastname).sendKeys("shah");
	  click(continuesubmit,"successfully clicked on sbmit");
	  
	  
	  
  }
}
