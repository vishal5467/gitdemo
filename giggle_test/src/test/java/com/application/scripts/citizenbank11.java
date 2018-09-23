package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank11 extends bank

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
		
		JavascriptExecutor jp=(JavascriptExecutor)driver;
		jp.executeScript("window.scrollBy(0,600)");
		
		click(calculator,"successfully clicked on calculator");
		driver.switchTo().frame(1);
		Thread.sleep(9000);
		Actions bar=new Actions(driver);
		bar.moveToElement(driver.findElement(students1));
		bar.click();
		bar.perform();
		click(students1,"successfully clicked on students");
		
		//click(slicebar, "successfully clicked on slice bar");
		JavascriptExecutor jd=(JavascriptExecutor)driver;
		jd.executeScript("window.scrollBy(0,300)");
		
		click(graduate, "successfully clicked on graduatestudent");
		
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		jc.executeScript("window.scrollBy(0,1000)");
		
		Actions bar2=new Actions(driver);
		bar2.moveToElement(driver.findElement(graduate));
		bar2.click();
		bar2.perform();
	//	click(applynow1, "successfully clicked on apply now");
		
		Thread.sleep(9000);
		
		
		
  }
}
