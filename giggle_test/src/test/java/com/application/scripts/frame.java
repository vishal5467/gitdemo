package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.framework;

public class frame extends framework
{
  @Test
  public void f() throws Throwable 
  {
	 boolean auto=driver.findElement(autpcomp).isDisplayed();
	 if (auto) 
	 { SuccessReport("verify link","successfully clicked link");
	   click(autpcomp, "success fully clicked auto complet");
		
	} else {
		failureReport("verify link","successfully clicked link");
	}
	 
	// driver.switchTo().frame(0);
	 driver.switchTo().frame(driver.findElement(swit));
	 boolean switchtext =driver.findElement(textswitch).isDisplayed();
	 if (switchtext) 
	 {
		SuccessReport("verify text","successfully displayed text");
		driver.findElement(textswitch).sendKeys("vishal");
	} else
	{
         failureReport("verify text","is not diaplyed text");
	}
	 driver.switchTo().defaultContent();
	  
	 boolean autocomplelogo= driver.findElement(log).isDisplayed();
	 if (autocomplelogo) 
	 {
		SuccessReport("verify logi","successfully displayed logo");
		click(log, "successfully clicked");
	} else {
		failureReport("verify logo","is not displayed logo");

	}
	  
  }
}
