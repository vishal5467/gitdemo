package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank12 extends bank
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
			click(undergraduatestudent, "successfully clicked on graduate student");
			
			Thread.sleep(8000);
			JavascriptExecutor jl=(JavascriptExecutor)driver;
			jl.executeScript("window.scrollBy(0,1500)");
			
			click(viewcalander, "successfully clicked on view calander");
			
			Thread.sleep(9000);
			
			click(january, "successfully clicked on january");
			
			click(february, "successfully clicked on fabruary");
			
			Thread.sleep(8000);
			
			
  }
}
