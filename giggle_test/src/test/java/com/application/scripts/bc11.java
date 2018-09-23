package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc11 extends bcbs

{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(medicare)).perform();
	  click(medicare, "successfully clikced medicare");
	  click(medicarepriscriptiondrug,"successfully clicked on pricription drug");
	  
	  Thread.sleep(10000);
//        WebElement popupwindow=driver.findElement(popup1);
//	  
//	  
//	  
//	  JavascriptExecutor jk=(JavascriptExecutor)driver;
//	  jk.executeScript("arguments[0].click();",popupwindow);
//	  
//	  Thread.sleep(5000);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,3000)");
	  
	  click(dollarplan28, "successfully lciked on 28 dollar plan");
	  org.openqa.selenium.Alert vishal=driver.switchTo().alert();
	  System.out.println("title of allert is"+vishal.getText());
	  vishal.accept();
	  
	  Thread.sleep(5000);
	  
	  Set<String>windowhadles=driver.getWindowHandles();
	  String window1= (String)windowhadles.toArray()[0];
	  System.out.println("1 st window id is "+window1);
	  String window2=(String)windowhadles.toArray()[1];
	  System.out.println("2nd window id is" +window2);
	  
	  driver.switchTo().window(window2);
	  
	  
	  JavascriptExecutor jm=(JavascriptExecutor)driver;
	  jm.executeScript("window.scrollBy(0,3000)");
	  
	  click(networkpharmaacy,"successfully clicked on network pharmacy");
	  
	  JavascriptExecutor jh=(JavascriptExecutor)driver;
	  jh.executeScript("window.scrollBy(0,1000)");
	  
	  click(cvsspecialist, "successfully clcikced on specialist");
	  
	  org.openqa.selenium.Alert vishal1=driver.switchTo().alert();
	  vishal1.accept();
	  
	  Thread.sleep(9000);
	  
	  Set<String> allwindowshandle=driver.getWindowHandles();
	  String win1=(String) allwindowshandle.toArray()[0];
	  String win2=(String) allwindowshandle.toArray()[1];
	  String win3=(String)allwindowshandle.toArray()[2];
	  
	  driver.switchTo().window(win3);
	  click(Cvsvideo,"successfully clicked on video");
	//  click(cvsvideo1,"successfully lcicke on cvsvideo");
	  
	  Thread.sleep(10000);
	  driver.switchTo().window(win2);
	  
	  click(pharmacynetwork, "clicked on pharmacy network");
	  
	  Thread.sleep(10000);
	  driver.switchTo().window(win1);
	  
	  JavascriptExecutor jg=(JavascriptExecutor)driver;
	  jg.executeScript("window.scrollBy(2000,0)");
	  
	  click(monthlyppo89, "successflly clicked on 89");
	 Thread.sleep(4000);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
