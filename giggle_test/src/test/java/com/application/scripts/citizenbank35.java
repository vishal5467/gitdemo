package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank35 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
	  click(cashbackplus, "successsfully clicked on cash back plus");
	  
	  JavascriptExecutor jh=(JavascriptExecutor)driver;
	  jh.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  Thread.sleep(5000);
	  
	  
  }
}
