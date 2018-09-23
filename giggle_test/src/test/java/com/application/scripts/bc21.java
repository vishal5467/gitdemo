package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc21 extends bcbs

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
	  Thread.sleep(5000);
	 JavascriptExecutor jg=(JavascriptExecutor)driver;
	 jg.executeScript("window.scrollBy(0,500)");
	 
	 click(longterm,"successfully clicked on radio");
	 
	 WebElement zip=driver.findElement(primaryhelthinsuracexzip);
	 zip.sendKeys("32763");
	 
//	 click(calanderfrom,"successfully clicked on calsnder from");
//	 
//	 click(selectdatefrom, "successfully clicked n date");
//	 
//	 click(calanderto,"successfully clicked on calander to");
//	 
//	 click(selecteddateto, "successfully clicked on select date to");
//	 
	 click(quatenow,"successfully clicke on quate now");
	 
	  click(quato1, "successfully clicked on quata1");
	  
	  Select vishal1=new Select(driver.findElement(startsekect));
	  vishal1.selectByIndex(1);
	  click(citizenshipradio, "successfully clicked on radio");
	  
	  Thread.sleep(20000);
	  
  }
}
