package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank8 extends bank
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
		
		click(meetmoneymarket, "successfully clied onm saving account");
		
		Set<String>windowhandles=driver.getWindowHandles();
		System.out.println("no of window is" +windowhandles.size()) ;
		String window1=(String)windowhandles.toArray()[0];
		String window2=(String)windowhandles.toArray()[1];
		String window3=(String)windowhandles.toArray()[2];
		
		driver.switchTo().window(window2);
		
		JavascriptExecutor ji=(JavascriptExecutor)driver;
		ji.executeScript("window.scrollBy(0,500)");
		
		click(platinummoney, "successfully clikedc on apply now");
		Thread.sleep(8000);
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
