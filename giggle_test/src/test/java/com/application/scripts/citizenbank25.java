package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank25 extends bank

{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
			click(subbankandcredit, "successfully subclicked bank and credit");
			
			JavascriptExecutor jf=(JavascriptExecutor)driver;
			jf.executeScript("window.scrollBy(0,400)");
			
			click(comparecreditcard, "successfully clicked on compare credit card");
			
			Thread.sleep(6000);
			JavascriptExecutor jd=(JavascriptExecutor)driver;
			jd.executeScript("window.scrollBy(0,700)");
			
			click(zeroliability, "successfully clicked on zero liability");
			
			JavascriptExecutor jl=(JavascriptExecutor)driver;
			jl.executeScript("window.scrollBy(0,500)");
			
			String defence=driver.findElement(fulldefence).getText();
			
			if (defence.equalsIgnoreCase("Full defense against unauthorized transactions"))
			{
				SuccessReport("verify text","text name is '"+defence+"'");
			} else {
                 failureReport("verify text","text name is not '"+defence+"'");
			}
			
  }
}
