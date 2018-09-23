package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank34 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
	  click(accountdocument, "successfully clicked on account documnet");
	Thread.sleep(8000);
	
	  JavascriptExecutor jf=(JavascriptExecutor)driver;
	  jf.executeScript("window.scrollBy(0,600)");
	 click(checkingaccountexpand,"successfully clicked on checking account");
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,600)");
	 click(savingaccountexpand, "successfully clicked on saving account expand");
	 Thread.sleep(6000);
	 click(irasaing, "successfully clickedo nirs saving");
	 Thread.sleep(8000);
	 
  }
}
