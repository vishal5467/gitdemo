package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc04 extends bcbs
{
  @Test
  public void f() throws Throwable
  {

	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(indiv)).perform();
	  click(indiv, "successfuly lcicked indi");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,500)");
	  
	  click(birth, "successfully clcicked birth");
  }
}
