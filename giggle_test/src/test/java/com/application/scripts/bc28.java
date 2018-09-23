package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc28 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(formember)).perform();
	  bar.moveToElement(driver.findElement(memberdiscount)).perform();
	  click(memberdiscount, "successfully clicked");
	  
	  Thread.sleep(8000);
	  
	  JavascriptExecutor jh=(JavascriptExecutor)driver;
	  jh.executeScript("window.scrollBy(0,400)");
	  
	  click(saveonpersonalcare,"successfully clicked on personalcare");
	  
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
