package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank41 extends bank
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
	  click(faq, "successfully clickedo on faq");
	  
	  Set<String>windowhandle=driver.getWindowHandles();
	  String window1=(String)windowhandle.toArray()[0];
	  String windiow2=(String)windowhandle.toArray()[1];
	  driver.switchTo().window(windiow2);
	 // click(whatisrater, "successfully clicked on what is rate");
//	  click(ratequate, "successfully clicked on rate quate");
//	  click(creditscore,"successfully clicked on score");
	 // Thread.sleep(6000);
	 click(edxpandall, "successfully clicked on exoamd");
	 
	  Thread.sleep(6000);
	  
  }
}
