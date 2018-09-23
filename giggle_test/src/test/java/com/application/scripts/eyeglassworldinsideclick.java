package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworldinsideclick extends eyeglass
{
  @Test
  public void f() throws Throwable 
  {
	  driver.findElement(gozip).sendKeys("32763");
	  click(gobuttn, "successfully clicked on submit");
	  
	  Thread.sleep(18000);
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,300)");
	  
	Thread.sleep(6000);
	  driver.switchTo().frame(driver.findElement(frame1));
	  Thread.sleep(6000);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  Thread.sleep(6000);
	  
	 
//      click(clickaltamonspring, "successfully clicked on exam");
         click(kisseme, "successfully clicked on kissme");
         
//	  JavascriptExecutor jl=(JavascriptExecutor)driver;
//	  jl.executeScript("arguments[0].click();", schedulefire);
	  Thread.sleep(8000);
	  click(schedulrexam,"successfully clicked on exam");
	  Thread.sleep(7000);
	  click(continue1, "successfully clicked on continue");
	  Thread.sleep(6000);
	  
//	  
	  
	  
	  
	  
  }
}
