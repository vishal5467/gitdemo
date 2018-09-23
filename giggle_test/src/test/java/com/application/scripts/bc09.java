package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc09 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(dental)).perform();
	  click(dental, "successfully clicked on dental");
	  //click(findplan1, "successfully lcicked on find plan");
//	  Thread.sleep(5000);
//	  WebElement popupwindow=driver.findElement(popup1);
//	  
//	  JavascriptExecutor js=(JavascriptExecutor)driver;
//	  js.executeScript("arguments[0].click();",popupwindow);
	  Thread.sleep(5000);
	  JavascriptExecutor jm=(JavascriptExecutor)driver;
	  jm.executeScript("window.scrollBy(0,8000)");
      
	  click(dentalppo,"successfully clicked on dental ppo");
	  
	  JavascriptExecutor jh=(JavascriptExecutor)driver;
	  jh.executeScript("window.scrollBy(0,9000)");
	  
	  click(allagespdf, "successfully clicked on all ages");
	  
	  Thread.sleep(20000);
	  String window1=driver.getWindowHandle();
	  System.out.println("1st window id is " +window1);
	  
	  String window2=driver.getWindowHandle();
	  System.out.println("2nd wind id is" +window2);
	  
	  Set<String>windowhandles=driver.getWindowHandles();
	  System.out.println("window iid is" +windowhandles);
	  System.out.println("no of window is" +windowhandles.size());
	  windowhandles.remove(window1);
	  driver.switchTo().window(windowhandles.iterator().next());
	  
	  JavascriptExecutor jn=(JavascriptExecutor)driver;
	  jn.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	  driver.switchTo().window(window1);
	  click(ppostandard,"successfully cliked on standard ppo");
	  Thread.sleep(5000);
	  
	  
  }
}
