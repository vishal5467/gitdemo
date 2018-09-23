package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank28 extends bank 
{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
	  click(checkingaccount1, "successfully clicked on checking acoount");
	  Thread.sleep(9000);
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,2100)");
	  
	  click(specifieyourloaction,"successfully clicked on change your location");
	  Thread.sleep(6000);
	  driver.findElement(zipinput).sendKeys("02904");
	  click(submit2, "successfully clicked on submit");
	  Thread.sleep(6000);
	  
	  
  }
}
