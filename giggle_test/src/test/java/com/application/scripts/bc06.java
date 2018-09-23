package com.application.scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc06 extends bcbs
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(dental)).perform();
	  click(dental, "successfully clicked on dental");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,4000)");
	  
	  click(howindividual, "successfully llicked on indivdual");
	  
	  Thread.sleep(6000);
	String window1=  driver.getWindowHandle();
	System.out.println("1st window id is" +window1);
	
	String window2=driver.getWindowHandle();
	System.out.println("2nd window id is" +window2);
	
	Set<String>allwindows= driver.getWindowHandles();
	System.out.println("all windows handle" +allwindows);
	
	allwindows.remove(window1);
	driver.switchTo().window(allwindows.iterator().next());
	click(affordabalecare, "successfully clcikes");
	click(howinsurancework, "successfully lcicked how insurance woirk");
	click(buyinghealthinsurance, "successfully clicked buying healthinsurance");
	click(understadningmybenfit, "successfully clicked understanonind");
	click(gettingcare,"successfully clicked gettingcare");
	click(manageaccount, "successfully clicked manage accoutn");
	click(claim,"successfully clicked claim");
	click(reform, "successfully clicked reform");
	click(othertopic, "successfully lciked othertopic");
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
	driver.switchTo().window(window1);
	click(findplan1, "successfully clicked plan");
	
	
	Thread.sleep(5000);
	
	  
  }
}
