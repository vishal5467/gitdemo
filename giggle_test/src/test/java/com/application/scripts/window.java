package com.application.scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.objectRepository.framework;

public class window extends framework  {
  @Test(priority=1)
  public void f() throws Throwable
 
  {
	  {
  	 click(alert,"successfully clicked");
  	 //get window id
  	 String windh=driver.getWindowHandle();
  	 System.out.println("window id is:"+windh);
       //get window handle
  	 Set<String>windows=driver.getWindowHandles();
  	 windows.remove(windh);
  	 
  	 driver.switchTo().window(windows.iterator().next());
  	 WebElement alertname=driver.findElement(name);
  			alertname.sendKeys("vishal"); 
  	 Thread.sleep(10000);
  	 driver.switchTo().window(windh);
  	// CloseChildewindows(windh);
  	 driver.switchTo().window(windh);
  	 
  	 click(frameandwindow, "successfully clicked framewindow");
  	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  	 
	  }
  	 
  }
   
        @Test(priority=2)
	  public void CloseChildewindows()
	  {
 	  String windh=driver.getWindowHandle();
  	  Set<String> allWindowsHandles =driver.getWindowHandles();
  	  System.out.println("all window handle:"+allWindowsHandles);
  	  for(String currentWindowHandle : allWindowsHandles)
  		//  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  	  {
  		  if (!currentWindowHandle.equals(windh)) 
  		  {
  			driver.switchTo().window(currentWindowHandle);
  			//driver.close();
  		}
  	  }
  	  
  	  
    }

  



}
