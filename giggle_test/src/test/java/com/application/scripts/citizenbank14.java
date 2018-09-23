package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank14 extends bank
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
			click(meidcaldentalstudent, "successfully clickedon medicaldental student");
			Thread.sleep(9000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,800)");
			click(fafsa, "successfully clicked on fafsa");
			
			Thread.sleep(4000);
			click(borrowstugent, "successfully clicked on borrow student");
			
			Thread.sleep(8000);
			click(homeborrwing,"successfully clicked on home borrowing");
			
			Thread.sleep(9000);
			
			click(homefinancialsolution, "successfully clicke on homefinancial solutionj");
			
			Thread.sleep(7000);
			click(actnow, "successfully clicke on actnow");
			
			Set<String>allwindowhandles =driver.getWindowHandles();
			String wind1=(String)allwindowhandles.toArray()[0];
			String wnd2=(String)allwindowhandles.toArray()[1];
			String wind3=(String)allwindowhandles.toArray()[2];
			String woind4=(String)allwindowhandles.toArray()[3];
			
			driver.switchTo().window(woind4);
			
			click(startnewapplication, "successfully clickedon start new application");
			Thread.sleep(5000);
			
			driver.findElement(createuserid).sendKeys("vishal");
			driver.findElement(createpassword).sendKeys("vishal");
			
			JavascriptExecutor jd=(JavascriptExecutor)driver;
			jd.executeScript("window.scrollBy(0,350)");
			
			driver.findElement(repassword).sendKeys("visha");
			
			click(next, "successfully clicked on next");
			Thread.sleep(7000);
			
  }
}
