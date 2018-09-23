package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank15 extends bank
{
  @Test
  public void f() throws Throwable
  {
	  click(bankcredit,"successfully clciked bank credit");
		click(subbankandcredit, "successfully subclicked bank and credit");
		
		JavascriptExecutor jf=(JavascriptExecutor)driver;
		jf.executeScript("window.scrollBy(0,400)");
		
		click(savingaccount, "successfully cliked on saving");
		
		Thread.sleep(9000);
		
		JavascriptExecutor jg=(JavascriptExecutor)driver;
		jg.executeScript("window.scrollBy(0,400)");
		
		click(cdsuit, "successfully clied onm saving account");
		
		Set<String>windowhandles=driver.getWindowHandles();
		System.out.println("no of window is" +windowhandles.size()) ;
		String window1=(String)windowhandles.toArray()[0];
		String window2=(String)windowhandles.toArray()[1];
		String window3=(String)windowhandles.toArray()[2];
		
		driver.switchTo().window(window2);
		Thread.sleep(10000);
		click(citizenonebank, "successfully clicked on citizenonebank");
		
		Thread.sleep(8000);
		
		click(homeborrowuing, "successfuilly cklicked on homwe borrowuing");
		
		Thread.sleep(6000);
		
		click(homeloanprogrram,"successfully clicked on home loan progrram");
		
		JavascriptExecutor jd=(JavascriptExecutor)driver;
		jd.executeScript("window.scrollBy(0,800)");
		
		click( talktohomeloanoraganizer,"successfully clicked on homeloan organjxzer");
		
		Set<String>allwindowhandles =driver.getWindowHandles();
		String wind1=(String)allwindowhandles.toArray()[0];
		String wnd2=(String)allwindowhandles.toArray()[1];
		String wind3=(String)allwindowhandles.toArray()[2];
		String woind4=(String)allwindowhandles.toArray()[3];
		
		driver.switchTo().window(woind4);
		Select vis=new Select(driver.findElement(whatstate));
		vis.selectByVisibleText("Florida");
		
		Select vis1= new Select(driver.findElement(whtcounty));
		vis1.selectByIndex(1);
		
		click(nextbutoon, "successfully clicked on next button");
		
		Thread.sleep(9000);
		
		
  }
}
