package com.application.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld09 extends eyeglass
{
	
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	 bar.moveToElement(driver.findElement(visioninsurance)).perform();
	click(visioninsurance, "seccessfully clicked");
	String visionimglogo=getText(logovisioninsurance,"text is");
	if (visionimglogo.equalsIgnoreCase("Vision Insurance")) 
	{
		SuccessReport("verify text","success fully displayed text");
		
	} else 
	{
       failureReport("verify text","");
 	}
  }
}
