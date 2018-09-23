package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc29 extends bcbs
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(formember)).perform();
	  bar.moveToElement(driver.findElement(helthandwell)).perform();
	  click(helthandwell, "successfully clciked");
	  Thread.sleep(9000);
	  
	  JavascriptExecutor jg=(JavascriptExecutor)driver;
	  jg.executeScript("window.scrollBy(0,1800)");
	  
	  click(gettingbetter,"successfully clicked");
	  Thread.sleep(9000);
	  
	  JavascriptExecutor jt=(JavascriptExecutor)driver;
	  jt.executeScript("window.scrollBy(0,500)");
	  
	  click(kidneyhelth, "succerssfully clicked");
	  
	  Thread.sleep(7000);
	  
	  click(quitsmoking, "successfully clicked");
	  JavascriptExecutor je=(JavascriptExecutor)driver;
	  je.executeScript("window.scrollBy(0,600)");
	  
	  click(account, "successfully clicked");
	  
	  Set<String>windowhandle=driver.getWindowHandles();
	  String window1=(String)windowhandle.toArray()[0];
	  String window2=(String)windowhandle.toArray()[1];
	  driver.switchTo().window(window2);
	  
	  driver.findElement(username).sendKeys("vishal");
	  
	  driver.findElement(password).sendKeys("shah");
	  Thread.sleep(6000);
	  click(login2, "successfully clicked");
	  
	  Thread.sleep(6000);
	  
	  
	  
  }
}
