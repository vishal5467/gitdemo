package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank47 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(studentlending1, "successfully clicked on student lending");
	  click(substudentlending, "successfully clicked on student lending");
	  Thread.sleep(5000);
	  click(explorestudentloan, "successfully clicked on exploreing ");
	  Thread.sleep(6000);
	  click(applyforstudentloan,"successfully clickedo on student loan");
	  Thread.sleep(6000);
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,1000)");
	  Select vis=new Select(driver.findElement(tellus));
	  vis.selectByIndex(3);
	  Select vis1=new Select(driver.findElement(selectloantype));
	  vis1.selectByIndex(1);
	  click(citizenbankcustomet, "successfully clicked on citizen bank customer");
	  
	  Thread.sleep(7000);
	  
	  
  }
}
