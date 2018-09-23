package com.application.scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld19 extends eyeglass
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
		 bar.moveToElement(driver.findElement(eyeglass)).perform();
		 bar.moveToElement(driver.findElement(eyeglasslence));
		  click(eyeglasslence,"successfully clicked");
		  driver.navigate().back();
		  Thread.sleep(5000);
  }
}
