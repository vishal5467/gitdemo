package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank40 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,800)");
	  click(specifieyourloaction, "successfully clicked on location");
	  Thread.sleep(3000);
	  driver.findElement(zipinput).sendKeys("02904");
	  Thread.sleep(7000);
	  click(submit2, "successfdully clicked on submiot");
	  Thread.sleep(5000);
	  JavascriptExecutor jp=(JavascriptExecutor)driver;
	  jp.executeScript("window.scrollBy(1000,0)");
	  Thread.sleep(2000);
	  click(borrowing, "successfully clicked on borrowing");
	  Thread.sleep(3000);
	  click(personalloan,"successfully clicked on personal loan");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1600)");
	  click(appynow9,"successfully clicked on apply now");
	  Thread.sleep(5000);
	  click(startnewapplication1, "succesfully clicked on appliation");
	  Thread.sleep(6000);
	  click(from,"successfully clicked on from");
	  Thread.sleep(5000);
//	  click(heading,"successfully clicke on heading");
//	  Thread.sleep(6000);
//	Select vis=new Select(driver.findElement(from));
//	vis.selectByIndex(0);
	  click(submenu,"successfully clicked on submenu");
	  
//	  JavascriptExecutor jr = (JavascriptExecutor)driver;
//	    //Hover on Automation Menu on the MenuBar
//	    jr.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");
	  
	  Thread.sleep(5000);
	
	  
  }
}
