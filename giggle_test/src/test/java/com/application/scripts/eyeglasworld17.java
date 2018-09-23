package com.application.scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglasworld17  extends eyeglass
{
  @Test
  public void f() throws Throwable 
  {
	 Actions bar=new Actions(driver);
	 bar.moveToElement(driver.findElement(eyeglass)).perform();
	 bar.moveToElement(driver.findElement(eyeglasslence));
	  click(eyeglasslence,"successfully clicked");
	  click(cr39, "successfully clicked");
	  click(virithin,"sucessfully lcicked");
	  click(driverlence, "sucessfully clicked");
	 
	  
  }
}
