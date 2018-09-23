package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc08 extends bcbs
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
//	  WebElement popupwindow=driver.findElement(popup1);
//	  
//	  JavascriptExecutor js=(JavascriptExecutor)driver;
//	  js.executeScript("arguments[0].click();",popupwindow);
	//  Thread.sleep(5000);
	  JavascriptExecutor jm=(JavascriptExecutor)driver;
	  jm.executeScript("window.scrollBy(0,2000)");
	  
	  click(chatonline, "successfullyu clicked on chat online");
	  Thread.sleep(10000);
	  String window1=driver.getWindowHandle();
	  System.out.println("1st window handle id is" +window1);
	  
	  String window2=driver.getWindowHandle();
	  System.out.println("2nd window id is" +window2);
	  
	  Set<String>windowshandle=driver.getWindowHandles();
	  System.out.println("no of window is" +windowshandle.size());
	  System.out.println("all window id is" +windowshandle);
	  
	  windowshandle.remove(window1);
	  driver.switchTo().window(windowshandle.iterator().next());
	  
	  Thread.sleep(3000);
	  WebElement onlinename1=driver.findElement(onlinename);
	  onlinename1.sendKeys("vishal");
	  
	  WebElement onlineemail1=driver.findElement(onlineemail);	  
	  onlineemail1.sendKeys("vishal");
	  click(startchat, "successfully lcicked chat");
	 
	 Thread.sleep(10000);
	 driver.switchTo().window(window1);
	 
	 click(livechat, "successfully clicked live chat");
	 
	 Thread.sleep(5000);
	 WebElement livechatname1=driver.findElement(livechatname);
	 livechatname1.sendKeys("vishal");
	 
	 JavascriptExecutor jk=(JavascriptExecutor)driver;
	 jk.executeScript("window.scrollBy(0,1000)");
	 
	 WebElement lasename1=driver.findElement(lastnamecht);
	 lasename1.sendKeys("shah");
	 
	 WebElement address1=driver.findElement(addresscht);
	 address1.sendKeys("vishal");
	 
	 WebElement city1=driver.findElement(city);
	 city1.sendKeys("orange city");
	 
	 Select bar1=new Select(driver.findElement(selectcht));
	 bar1.selectByVisibleText("FL");
	 
	 WebElement email1=driver.findElement(emaillive);
	 email1.sendKeys("vishal");
	 
	 WebElement phone1=driver.findElement(phonelive);
	 phone1.sendKeys("132346536356");
	 
	 Select sl=new Select(driver.findElement(ageselect));
	 sl.selectByValue("25-29");
	 
	 click(radiocheckbox, "successfully checked on box");
	 
	 click(radiodentalcheck, "successfully cliclked on denal");
	 
	 click(longtermcheck, "successfully ckicked on longterm");
	 
	 click(livesublit,"successfully lcickin on subligt");
	 
	 JavascriptExecutor jg=(JavascriptExecutor)driver;
		jg.executeScript("window.scrollBy(0,400)");	 
	 Thread.sleep(4000);
	 
	 
	 Thread.sleep(5000);
	 
	 
  }
}
