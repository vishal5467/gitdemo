package com.application.scripts;


import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc12 extends bcbs
{
  @Test
  public void f() throws Throwable 
  
  {
	  click(login, "successfully login");
 // click(member, "successfully clicked on member");
  Thread.sleep(10000);
  //click(resisternow, "successfully clikdd in regester");
  click(alreadymember, "successfully clicked on member");
  
  Thread.sleep(10000);
  
  WebElement popupwindow=driver.findElement(popup1);
  
  
  
  JavascriptExecutor jk=(JavascriptExecutor)driver;
  jk.executeScript("arguments[0].click();",popupwindow);
  Thread.sleep(5000);
  
  WebElement register=driver.findElement(registernow);
  JavascriptExecutor ji=(JavascriptExecutor)driver;
  ji.executeScript("arguments[0].click();",register);
  
 // click(registernow,"successfully clicked on registernow");
  Thread.sleep(10000);
  Set<String>allwindowhandle=driver.getWindowHandles();
  String window1=(String)allwindowhandle.toArray()[0];
  String window2=(String)allwindowhandle.toArray()[1];
  
  driver.switchTo().window(window2);
  
  	driver.findElement(firstname).sendKeys("vishal");
  	driver.findElement(lastname).sendKeys("shah");
  	
  	JavascriptExecutor jh=(JavascriptExecutor)driver;
  	jh.executeScript("window.scrollBy(0,400)");
 
  	Select vishal=new Select(driver.findElement(month));
  	vishal.selectByIndex(0);
  	Thread.sleep(5000);
  	Select vishal1=new Select(driver.findElement(day));
  	vishal1.selectByIndex(0);
  	Thread.sleep(4000);
  	driver.findElement(year).sendKeys("1988");
  	driver.findElement(idnumber).sendKeys("12345");
  	
  	click(idonothaveid, "szuccessfully clciked on id");
  	
  	driver.findElement(enretemail).sendKeys("vishalkshah");
  	click(continuesubmit, "successfully clciked on submit");
  	Thread.sleep(5000);
  	driver.switchTo().window(window1);
  	click(visitmedicaresite, "successfully clicked on medicaresite");
  	
  	Thread.sleep(5000);
  	
  	
  	
  }
}

