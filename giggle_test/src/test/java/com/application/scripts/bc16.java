package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc16 extends bcbs

{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(medicareandstate)).perform();
	  click(medicareandstate, "successfuly clicked on plan");
	  
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	  click(logo, "successfully lcikcked on logo");
	  
	  org.openqa.selenium.Alert vishal1=driver.switchTo().alert();
	  vishal1.accept();
	  Thread.sleep(9000);
	  Set<String>windowhandle=driver.getWindowHandles();
	  String window1=(String)windowhandle.toArray()[0];
	  String window2=(String)windowhandle.toArray()[1];
	  driver.switchTo().window(window2);
	  JavascriptExecutor jh=(JavascriptExecutor)driver;
	  jh.executeScript("window.scrollBy(0,800)");
	  
	  
	  click(arrow, "sucessfully clicked on window");
	  Thread.sleep(5000);
	  click(arrow2, "successfully clicked on window2");
	  Thread.sleep(10000);
	  
	  JavascriptExecutor jk=(JavascriptExecutor)driver;
	  jk.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	  click(print, "successfully lcikced on print");
	  Thread.sleep(10000);
	  
  }
}
