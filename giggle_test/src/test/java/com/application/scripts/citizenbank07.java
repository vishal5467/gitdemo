package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank07 extends bank
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
		
		click(exploresavingaccount, "successfully clied onm saving account");
		
		Set<String>windowhandles=driver.getWindowHandles();
		System.out.println("no of window is" +windowhandles.size()) ;
		String window1=(String)windowhandles.toArray()[0];
		String window2=(String)windowhandles.toArray()[1];
		String window3=(String)windowhandles.toArray()[2];
		
		driver.switchTo().window(window2);
		JavascriptExecutor ji=(JavascriptExecutor)driver;
		ji.executeScript("window.scrollBy(0,1000)");
		
		click(savingcalculator, "successfully clikek on saving calculator");
		
		Thread.sleep(9000);
		
		driver.findElement(savinggoal).sendKeys("200000");
		driver.findElement(monthlysavimg).sendKeys("200");
		click(calculate, "successfully clicked on xalculate");
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("window.scrollBy(0,100)");
		
		Thread.sleep(9000);
		
		
		
  }
}
