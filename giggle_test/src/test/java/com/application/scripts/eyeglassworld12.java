package com.application.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld12 extends eyeglass
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(offer)).perform();
	 // not use click   on click(offer,"successfully clicked");
	  bar.moveToElement(driver.findElement(bifocaloffer)).perform();
	  click(bifocaloffer, "successfully clicked");
	  
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
	    
	    WebElement zipcode=driver.findElement(offerzipcode);
			  zipcode.sendKeys("32763");
			  click(offergo,"successfully clicked");
			  String offertexr= getText(offerserch, "verify text");
			  if (offertexr.equalsIgnoreCase("Altamonte Springs"))
			  {
				SuccessReport("verify text","text is displayed'"+offertexr+"'");
			} else {

			}
  }
}
