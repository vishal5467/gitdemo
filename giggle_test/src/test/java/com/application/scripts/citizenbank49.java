package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank49 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(studentlending1, "successfully clicked on student lending");
	  click(substudentlending, "successfully clickedo on substudent lendoing");
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,400)");
	  click(explorestudentloanforparent, "successfully clicked on parentds");
	  JavascriptExecutor jf=(JavascriptExecutor)driver;
	  jf.executeScript("window.scrollBy(0,1500)");
	click(appynow3, "successfuly clickeedo on apply now 3");
	
	  Thread.sleep(6000);
	  
  }
}
