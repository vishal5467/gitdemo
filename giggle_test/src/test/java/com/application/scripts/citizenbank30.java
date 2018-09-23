package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank30 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
	  click(savingaccountoption, "succesfully clicked on saving account optoin");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,500)");
	  
	  click(comparesaving,"successfully clicked on compare saving");
	  Thread.sleep(5000);
	  click(applynow2, "successfully clicked on apply now");
	  
  }
}
