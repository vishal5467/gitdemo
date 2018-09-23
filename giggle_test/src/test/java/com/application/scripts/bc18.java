package com.application.scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc18 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(medicareandstate)).perform();
	  click(medicareandstate, "successfuly clicked on plan");
	  Thread.sleep(9000);
	 click(finddoctor1, "successfully clicked on find doctor");
	 
	 String finddocotettext=driver.findElement(finddoctortext).getText();
	 if (finddocotettext.equalsIgnoreCase("Find a Doctor, Pharmacy or Dentist"))
	 {
		SuccessReport("verify text","text displayed is '"+finddocotettext+"'");
		
	} else {
              failureReport("verify text","text displayed is not'"+finddocotettext+"'");
	}
  }
}
