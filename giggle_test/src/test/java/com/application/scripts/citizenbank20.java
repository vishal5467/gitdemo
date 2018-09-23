package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank20 extends bank 
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
			click(personloan, "successfully clicked on personloan");
			
			JavascriptExecutor ja=(JavascriptExecutor)driver;
			ja.executeScript("window.scrollBy(0,600)");
			
			click(debtconsoliation, "suceessfully clickrd on debt consoliation");
			Thread.sleep(5000);
			
			click(estimatepayment, "successfully clikcked on estimatepayment");
			Thread.sleep(6000);
			
			
	  
  }
}
