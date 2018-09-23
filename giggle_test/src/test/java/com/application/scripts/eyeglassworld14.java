package com.application.scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld14 extends eyeglass {
  @Test
  public void f() throws Throwable
  {
	  Actions bar= new Actions(driver);
	  bar.moveToElement(driver.findElement(eyeglass)).perform();
	  bar.moveToElement(driver.findElement(womenglass)).perform();
	  click(womenglass,"successfully clicked");
	  click(womenglassname, "successfully clicked");
	  String womenglass= getText (womenglassname,"name is");
	  if (womenglass.equalsIgnoreCase("Marilyn Monroe MMO 122")) 
	  {
		SuccessReport("verify name","name is enable'"+womenglass+"'" );
		
	} else {
        failureReport("verify name","name is  not enable'"+womenglass+"'" );
	}
	  click(womenglassrotate,"successfully clicked");
	  Thread.sleep(5000);
  }
}
