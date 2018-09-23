package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank50 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(studentlending1, "successfully clicked on student lending");
	  click(substudentlending, "successfully clickedo on substudent lendoing");
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,400)");
	  click(exploringgradutestudent, "successfuly clickedon gradute nstudentloan");
	  Thread.sleep(6000);
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,400)");
	  
	  click(mbastudent, "successfully clicked on mbastudent");
	  JavascriptExecutor jg=(JavascriptExecutor)driver;
	  jg.executeScript("window.scrollBy(0,2000)");
	  click(appynow4, "successfully clickedo applyno4");
	  Thread.sleep(6000);
	  click(accessexistapplecation, "successfully clicked on access existasnxed application");
	  click(uploadapplication, "successfully clickedon upload application");
	  Thread.sleep(6000);
	  
	  
  }
}
