package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class Eyeglassworld21 extends eyeglass 
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(contactlence)).perform();
	  bar.moveToElement(driver.findElement(weeklydisposal)).perform();
	  click(weeklydisposal,"clicked on disposal");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	  click(extremh20, "successfully clicked");
	  
	  Select vishal=new Select(driver.findElement(rightpower));
	  vishal.selectByVisibleText("-2.75");
	  Select vishal1=new Select(driver.findElement(leftpower));
	  vishal1.selectByVisibleText("-2.25");
	  click(addshoppingcart, "successfully lcicked");
	  
	  JavascriptExecutor jv=(JavascriptExecutor)driver;
	  jv.executeScript("window.scrollBy(0,4500)");
	  click(preference, "successfully clciked");
	  click(startcheckout, "successfully clcick");
	  
	 JavascriptExecutor jm=(JavascriptExecutor)driver;
		jm.executeScript("window.scrollBy(0,document.body.scrollHetght)");
		click(conti, "successfully clicked conti");
  }
}
