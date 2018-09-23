package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank29 extends  bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
	  click(checkingaccount1, "successfully clicked on checking acoount");
	  Thread.sleep(9000);
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,400)");
	  
	  click(comparecheckingaccount,"successfully clicked on checking account");
	  Thread.sleep(5000);
	  click(platiniumplus, "successfully clickedo platimumplus");
	  driver.findElement(zip).sendKeys("02904");
		Thread.sleep(9000);
		
		click(checkbox, "successfully clickec on checkbox");
		Thread.sleep(6000);
		click(platinumaccount, "successfully clikked on platinum");
		
		click(contbutton, "successfully clicked on contibuttoin");
		
		Thread.sleep(9000);
		
		driver.findElement(username).sendKeys("vishal");
		driver.findElement(lastname).sendKeys("shah");
		
		Select vis=new Select(driver.findElement(dropdown));
	    vis.selectByIndex(1);
	    driver.findElement(phonenumber).sendKeys("386344");
	    
	    Thread.sleep(6000);
	    
	    JavascriptExecutor jp=(JavascriptExecutor)driver;
	    jp.executeScript("window.scrollBy(0,700)");
	    
	    Thread.sleep(6000);
	    click(nextbutton, "successfully clicked on next buttoin");
	    
		
		Thread.sleep(8000);
		
  }
}
