package com.application.scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bs07 extends bcbs

{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(dental)).perform();
	  click(dental, "successfully clicked on dental");
	  //click(findplan1, "successfully lcicked on find plan");
	  Thread.sleep(5000);
	  WebElement popupwindow=driver.findElement(popup1);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();",popupwindow);
	  Thread.sleep(5000);
	  click(findplan1,"successfully lcicked on find plan");
	 Thread.sleep(10000);
	 click(yeslogin,"successfully lcicked yes login");
	 Thread.sleep(10000);
	 
	  String window1=driver.getWindowHandle();
	  System.out.println("1st window handle" +window1);
	  
	  String window2=driver.getWindowHandle();
	  System.out.println("2nd window is" +window2);
	  
	  Set<String>windowshandle=driver.getWindowHandles();
	  System.out.println("all window id is" +windowshandle);
	  windowshandle.remove(window1);
	  driver.switchTo().window(windowshandle.iterator().next());
	  WebElement username1=driver.findElement(username);
	  username1.sendKeys("vishal");
	  
	  WebElement password1=driver.findElement(password);
	  password1.sendKeys("vishal");
	  Thread.sleep(3000);
	  click(login1,"successfullt clicked on login");
	  
	  Thread.sleep(6000);
	  driver.switchTo().window(window1);
	  click(closeloginwindow, "successfully clicked close window");
	  
	  Thread.sleep(5000);
	  
	  
	  
  }
}
