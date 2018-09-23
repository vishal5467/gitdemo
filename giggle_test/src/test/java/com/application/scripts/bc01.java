package com.application.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc01 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  String blue=driver.findElement(bluecross).getAttribute("title");
	  
	  if (blue.equalsIgnoreCase("Blue Cross Blue Shield of Michigan and Blue Care Network are Michigan health insurance companies."))
	  {
		SuccessReport("verify text","text is '"+blue+"'");
	} else {
          failureReport("verify text","text is not'"+blue+"'");
	}
  }
}
