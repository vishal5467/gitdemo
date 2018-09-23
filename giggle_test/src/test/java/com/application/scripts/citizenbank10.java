package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank10 extends bank
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
		click(parents, "successfully clicked on parents");
		
		Thread.sleep(8000);
		click(applynow1, "successfully clicked on apply now");
		
		JavascriptExecutor jh=(JavascriptExecutor)driver;
		jh.executeScript("window.scrollBy(0,500)");
		
		Select bar=new Select(driver.findElement(tellus));
		bar.selectByIndex(1);
		Thread.sleep(9000);
		
		click(selectschool, "successfully clicked on school");
		
		
		Thread.sleep(8000);
		Select vis=new Select(driver.findElement(state));
		vis.selectByIndex(10);
		Thread.sleep(9000);
		//driver.findElement(nameofuni).sendKeys("university of central florida");
		Actions bar1=new Actions(driver);
		bar1.moveToElement(driver.findElement(nameofuni));
		bar1.click();
		bar1.sendKeys("university of central florida");
		bar1.perform();
		Thread.sleep(9000);
		Actions bar2=new Actions(driver);
		bar2.moveToElement(driver.findElement(universityname));
		bar2.click();
		bar2.perform();
		
		
		Thread.sleep(12000);
		
	    
		
		
		
  }
}
