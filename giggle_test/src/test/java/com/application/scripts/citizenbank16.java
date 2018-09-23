package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank16 extends bank
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
			
			click(creditcard1, "successfuilly cklicked on homwe borrowuing");
			
			Thread.sleep(6000);
			click(learnmore,"successfully clicked on learn mopre");
			Thread.sleep(8000);
			click(registernow1, "successfully lciked on register");
			
			Thread.sleep(8000);
			click(register, "successfully cliced onm register");
			driver.findElement(nameappeard).sendKeys("vishal");
			
			driver.findElement(accountnumber1).sendKeys("1234");
			driver.findElement(accountnumbet2).sendKeys("5678");
			driver.findElement(accountnumber3).sendKeys("9012");
			driver.findElement(accountnumber4).sendKeys("3456");
			
			click(next1, "successfully clicked on next");
			
			Thread.sleep(6000);
			
			
			
  }
}
