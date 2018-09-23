package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank22 extends bank
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
		click(aytofinance,"successfully clicked on autofinance");
		Thread.sleep(6000);
		
		click(paymyloan, "successfully clicked on paymy loan");
		
		Thread.sleep(6000);
		click(setrecurrentpayment, "successfully clicked on set recurrent paymrnt");
		
		Set<String>allwindowhandle=driver.getWindowHandles();
		String wid1=(String)allwindowhandle.toArray()[0];
		String win2=(String)allwindowhandle.toArray()[1];
		String win3=(String)allwindowhandle.toArray()[2];
		String win4=(String)allwindowhandle.toArray()[3];
		driver.switchTo().window(win4);
		Thread.sleep(4000);
		driver.findElement(uname).sendKeys("vishal");
		driver.findElement(password).sendKeys("visha1");
		Thread.sleep(7000);
		
		click(submit, "successfully clicked on submiyt");
		Thread.sleep(6000);
		
  }
}
