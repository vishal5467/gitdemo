package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank33 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
	  click(irasaing, "successfully clciked on irasaving");
	  Thread.sleep(6000);
	  
	  JavascriptExecutor jf=(JavascriptExecutor)driver;
	  jf.executeScript("window.scrollBy(0,400)");
	  Thread.sleep(6000);
	  click(learnmore5,"sucessfully clicked on learnmre 5");
	  Thread.sleep(7000);
	  JavascriptExecutor jr=(JavascriptExecutor)driver;
	  jr.executeScript("window.scrollBy(0,800)");
	 
	 
	  click(compareiraaccount,"sucessfully clicked on iraaccont");
	  
	  
	  Thread.sleep(6000);
	  
	  }
}
