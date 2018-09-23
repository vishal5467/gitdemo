package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;
import com.sun.jna.platform.win32.WinUser.WINDOWINFO;

public class bc24 extends bcbs
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(helthinsurance101)).perform();
	  bar.moveToElement(driver.findElement(whatnew1)).perform();
	  
	  click(whatnew1, "successfully clicke on whatnew");
	  
	Thread.sleep(5000);
	click(findwalkin,"successfully clicked on find wealsk in ");
	Thread.sleep(6000);
	
	click(calculatorAndtool, "successfully clicked on tool");
	Thread.sleep(5000);
	click(helthsaviong, "successfully clicked on helthsaving");
	
	Thread.sleep(6000);
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	jk.executeScript("window.scrollBy(0,600)");
	
	click(futerbalacecalculator, "successfully clicked on futerbalance calculator");
	
	click(gestarted, "successfully clicke on getr started");
	Thread.sleep(5000);
	org.openqa.selenium.Alert vis=driver.switchTo().alert();
	Thread.sleep(5000);
	vis.accept();
	Thread.sleep(6000);
//	
//	 Set<String>windowhandle=driver.getWindowHandles();
//	  String window1=(String)windowhandle.toArray()[0];
//	  String window2=(String)windowhandle.toArray()[1];
//	driver.switchTo().window(window2);
	String window1=driver.getWindowHandle();
	System.out.println("windowis is"+window1);
	String window2=driver.getWindowHandle();
	System.out.println("window is is"+window2);
	Set<String>windowhandles=driver.getWindowHandles();
	System.out.println("windows id is" +windowhandles);
	System.out.println("no of wondow os"+windowhandles.size());
	windowhandles.remove(window1);
	driver.switchTo().window(windowhandles.iterator().next());
	Thread.sleep(35000);
	JavascriptExecutor jo=(JavascriptExecutor)driver;
	jo.executeScript("window.scrollBy(0,50)");
	WebElement bigin=driver.findElement(balanceexistance);
	bigin.sendKeys("123");
	driver.findElement(rate).sendKeys("25%");
	click(calculate, "successfuly claculate");
	
	Thread.sleep(20000);
	
  }
}
