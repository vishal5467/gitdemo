package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank04 extends bank

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
		
		click(moblile, "successfully clicke on mobile");
		
		Thread.sleep(8000);
		click(onlinebanking,"successfuly clicked ");
		Thread.sleep(9000);
		driver.switchTo().frame(0);
		//click(lastfourssn,"successfully lciked");
		driver.findElement(lastfourssn).sendKeys("1234");
		driver.findElement(accountnumber).sendKeys("1234");
		driver.findElement(atmcaedpin).sendKeys("1234");
		driver.findElement(atmdebitcard).sendKeys("1234567891234567");
		click(nextbutto, "successfully clicked on next");
		
		Thread.sleep(6000);
		
  }
}
