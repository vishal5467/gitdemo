package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bs22 extends bcbs
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar= new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(specialitybenifit)).perform();
	  click(specialitybenifit, "successfully clickdd on specialbenifit");
	  Thread.sleep(8000);
	  click(internationplan,"succesfully clicked on plan");
	  Thread.sleep(8000);
	  click(geoplan,"successfully clicked on geo blue plan");
	  org.openqa.selenium.Alert vishal=driver.switchTo().alert();
	  vishal.accept();
	  Set<String>windowhandle=driver.getWindowHandles();
	  String window1=(String)windowhandle.toArray()[0];
	  String window2=(String)windowhandle.toArray()[1];
	  
	  driver.switchTo().window(window2);
	  Actions bar1=new Actions (driver);
	  bar1.moveToElement(driver.findElement(travelmedicalpal)).perform();
	  Thread.sleep(6000);
	  bar1.moveToElement(driver.findElement(singletrip)).perform();
	  click(singletrip, "successfully clicked on voyanger");
	  JavascriptExecutor jm=(JavascriptExecutor)driver;
	  jm.executeScript("window.scrollBy(0,600)");
	  
	  click(comparevoyangerplan,"successfully cluicked on voyngerplan");
	  Thread.sleep(6000);
	  
  }
}
