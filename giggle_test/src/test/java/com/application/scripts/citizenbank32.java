package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank32 extends bank
{
  @Test
  public void f() throws Throwable 
  
  //google chrome and foirefox driver pen websites different
  {
	  click(bankcredit,"successfully clciked bank credit");
	  click(certificateofdeposit, "successfully clicked on certificate of deposite");
	  Thread.sleep(6000);
	  
	  JavascriptExecutor jr=(JavascriptExecutor)driver;
	  jr.executeScript("window.scrollBy(0,1200)");
	  click(learnmore4, "successfully clicked on learn more");
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,200)");
	  click(openaccount5, "successfully clicked on openaccont");
	  Thread.sleep(4000);
	  
	  }
  
}
