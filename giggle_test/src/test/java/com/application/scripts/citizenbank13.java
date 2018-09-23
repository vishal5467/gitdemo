package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank13 extends bank
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
		
		click(students, "successfully clicked on students");
		
		Thread.sleep(8000);
		
		JavascriptExecutor jo=(JavascriptExecutor)driver;
		jo.executeScript("window.scrollBy(0,1000)");
		
		click(getmyrate, "successfully clicjked on rate");
		
		Thread.sleep(9000);
		
		click(currentlyinschool, "successfully clicked on currently in schoo");
		Thread.sleep(8000);
		driver.findElement(firstname1).sendKeys("vishal");
         Thread.sleep(7000);
		driver.findElement(lastname1).sendKeys("shah");
		Thread.sleep(7000);
		JavascriptExecutor jr=(JavascriptExecutor)driver;
		jr.executeScript("window.scrollBy(0,400)");
		Thread.sleep(6000);
		driver.findElement(streetname).sendKeys("2520lookoutpoint ");
		Thread.sleep(6000);
		driver.findElement(appartment).sendKeys("208");
		
		JavascriptExecutor jw=(JavascriptExecutor)driver;
		jw.executeScript("window.scrollBy(0,500)");
		
		click(checkbox1, "successfully clickedo on checkbox");
		
		Thread.sleep(8000);
		
  }
  
}
