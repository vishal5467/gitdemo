package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank48 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(studentlending1, "successfully clicked on student lending");
	  click(studentloan, "successfully clicked on student loan");
	  Thread.sleep(6000);
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,2000)");
	  click(appynow2,"successfully clicked on appy now2");
	  Thread.sleep(5000);
	  
  }
}
