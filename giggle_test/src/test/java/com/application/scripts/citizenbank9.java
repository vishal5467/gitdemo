package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank9 extends bank
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
		click(seeexample, "successfully clicked on apply now");
		
		Thread.sleep(7000);
	
		driver.switchTo().frame(0);
		
		Select bar=new Select(driver.findElement(firstselect));
		bar.selectByIndex(0);
		
		Thread.sleep(6000);
		Select bar1=new Select(driver.findElement(secondselect));
		bar1.selectByIndex(0);
		
		Thread.sleep(7000);
		Select bar2=new Select(driver.findElement(thirdselect));
		bar2.selectByIndex(1);
		
		Thread.sleep(5000);
		
		Select bar3=new Select(driver.findElement(forthsedlect));
		bar3.selectByIndex(2);
		
		Thread.sleep(9000);
		
		
		
  }
}
