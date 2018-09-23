package com.application.scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld10 extends  eyeglass
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(eyeglasss)).perform();
	  bar.moveToElement(driver.findElement(menglass)).perform();
      click(menglass,"successfully clicked");
      String frametext=getText(frame, "frame name is");
      if (frametext.equalsIgnoreCase("Lucky Beach Front"))
      {
		SuccessReport("verify frame name","Frame name is'"+frametext+"' is success fully displayed");
	} else {
       failureReport("verify frame name","frame name is '"+frametext+"' is not displayed");
	}
  }
}
