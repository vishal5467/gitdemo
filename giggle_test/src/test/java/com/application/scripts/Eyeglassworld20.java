package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class Eyeglassworld20 extends eyeglass
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(eyeglass)).perform();
	  click(sunglass, "succcessfully clicked sunglass");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,4000)");
	  click(sunglasspage2, "clicked on page 2");
	  click(aramisunglass, "clicked on arami glas");
	  String aramisunglasstext=driver.findElement(aeamitext).getText();
	  if (aramisunglasstext.equalsIgnoreCase("Armani Exchange Ax 4050s")) 
	  {
		  SuccessReport("verify text","text is '"+aramisunglasstext+"'" );
		
	} else {
        failureReport("verify text","text is not '"+aramisunglasstext+"'");
	}
	  click(rotatesunglas, "rotated");
	  click(rotatesunglas, "successfully clcick");
	  Thread.sleep(4000);
}
}
