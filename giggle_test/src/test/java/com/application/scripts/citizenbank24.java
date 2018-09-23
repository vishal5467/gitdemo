package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank24 extends bank

{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
		click(subbankandcredit, "successfully subclicked bank and credit");
		
		JavascriptExecutor jf=(JavascriptExecutor)driver;
		jf.executeScript("window.scrollBy(0,400)");
		
		click(comparecreditcard, "successfully clicked on compare credit card");
		
		Thread.sleep(6000);
		
		JavascriptExecutor jd=(JavascriptExecutor)driver;
		jd.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(7000);
		click(learnmre,"successfully clicked on learnmore");
		Thread.sleep(6000);
		click(applynw, "successfully clicked on apply now");
		
		Set<String>windowhandle=driver.getWindowHandles();
		String win1=(String)windowhandle.toArray()[0];
		String win2=(String)windowhandle.toArray()[1];
		driver.switchTo().window(win2);
		Thread.sleep(6000);
		driver.findElement(name).sendKeys("vishal");
		Select vis1= new Select (driver.findElement(birthmonth));
		vis1.selectByVisibleText("Nov");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(mobliareacode).sendKeys("386");
		driver.findElement(mobilephone1).sendKeys("344");
		driver.findElement(mobliephone2).sendKeys("3249");
		driver.findElement(streetaddress).sendKeys("lookoutpoint street");
		
		Thread.sleep(8000);
		
  }
}
