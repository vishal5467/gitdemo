package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank05 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
			click(subbankandcredit, "successfully subclicked bank and credit");
			
			JavascriptExecutor jf=(JavascriptExecutor)driver;
			jf.executeScript("window.scrollBy(0,400)");
			
			click(explorecheckingaccount, "successfully cliked on checking account");
			
			Thread.sleep(7000);
			click(overdraft5, "successfully clicked on overdraft");
			
			Thread.sleep(9000);
			click(overdraftchoice, "successfully cliked on overdraft choice");
			Thread.sleep(9000);
			JavascriptExecutor jg=(JavascriptExecutor)driver;
			jg.executeScript("window.scrollBy(0,1800)");
			
			click(findbranch, "successfully clicked onm find branch");
			
			Set<String>windowhandle=driver.getWindowHandles();
			String window1=(String)windowhandle.toArray()[0];
			String window2=(String)windowhandle.toArray()[1];
			
			driver.switchTo().window(window2);
			driver.findElement(zipcodeserch1).sendKeys("32763");
			
			click(findbutton, "successfully cliked on find button");
			
			Thread.sleep(7000);
			JavascriptExecutor jh=(JavascriptExecutor)driver;
			jh.executeScript("window.scrollBy(0,500)");
			
			Thread.sleep(9000);
			
			JavascriptExecutor jt=(JavascriptExecutor)driver;
			jt.executeScript("window.scrollBy(500,0)");
			
			click(branches, "successfully clikked on brasches");
			
			click(atm, "successfully cliked on atm");
			
			click(supermarket, "successfully clicked on supermarket");
			
			click(voiceassistanceatm, "successfully cliclked on vloiceassts");
			
			click(opennow, "successfully clicked on open now");
			
			
			Thread.sleep(9000);
			
			String logo1=driver.findElement(cumberlandfarm).getText();
			if (logo1.equalsIgnoreCase("Cumberland Farms")) 
			{
				SuccessReport("verify text","name is '"+logo1+"'");
			} else {
                   failureReport("verify text","name is not '"+logo1+"'");
			}
					
			
			Thread.sleep(9000);
			
			
			
  }			
}

