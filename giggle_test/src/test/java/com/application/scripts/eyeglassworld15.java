package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld15 extends eyeglass
{
  @Test
  public void f() throws Throwable {
	  Actions bar= new Actions(driver);
	  bar.moveToElement(driver.findElement(eyeglass)).perform();
	  bar.moveToElement(driver.findElement(kidsglass)).perform();
	  click(kidsglass, "sucessfully cicked");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 
	  click(secondpage, "successfully clicked");
	 click(kidsglasssecond, "successfully rotate");
	 
	// click(kidglassrotate, "successfully roate");
	// Thread.sleep(7000);
	  
	 JavascriptExecutor jv=(JavascriptExecutor)driver;
	 jv.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 
	}
  }
  
  
