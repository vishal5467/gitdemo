package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc19 extends bcbs{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();;
	  bar.moveToElement(driver.findElement(groupplan)).perform();;
	  click(groupplan, "successfully clicked on group plan");
	  Thread.sleep(5000);
	  Actions bar1=new Actions (driver);
	  bar1.moveToElement(driver.findElement(productandservice)).perform();
	  bar1.moveToElement(driver.findElement(productandvision)).perform();
	  click(productandvision, "successfully clicked on vision");
	   
	  Thread.sleep(5000);
	  
	  JavascriptExecutor jg=(JavascriptExecutor)driver;
	  jg.executeScript("window.scrollBy(0,1000)");
	  
	  click(bluevision, "successfully clicked on blue vision");
	  
	  Thread.sleep(4000);
	  
	  click(pricacyexchange, "successfully clicked on privacy exchange");
	  
	  Thread.sleep(4000);
	  JavascriptExecutor jk=(JavascriptExecutor)driver;
	  jk.executeScript("window.scrollBy(0,800)");
	  
	  click(coveraglogo, "successfully clicked on coverahelogo");
	  Thread.sleep(9000);
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,500)");
	 Thread.sleep(9000);
	 
	 Screen vishal=new Screen();
	 Pattern img1=new Pattern("C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\images\\Capture6.PNG");
	 vishal.click(img1);
	// JavascriptExecutor jl=(JavascriptExecutor)driver;
	  //jl.executeScript("arguments[0].click();",youtubeclick);
	  
	//  Actions bar2=new Actions(driver);
	 // Thread.sleep(6000);
	//  bar2.moveToElement(driver.findElement(move)).perform();
	  //bar2.contextClick(driver.findElement(youtubeloop)).perform();
	  //Thread.sleep(4000);
//	 bar2.doubleClick(driver.findElement(youtubeclick)).perform();
	// Thread.sleep(7000);
	  //click(youtubeclick, "successfully clicked");
	  
	  Thread.sleep(20000);
	  
	  
  }
}
