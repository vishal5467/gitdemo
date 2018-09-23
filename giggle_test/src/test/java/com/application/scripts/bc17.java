package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc17 extends bcbs
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(medicareandstate)).perform();
	  click(medicareandstate, "successfuly clicked on plan");
	  Thread.sleep(9000);
	  click(informatiobn,"succesfully lcikced on nformantiob");
	  
	  JavascriptExecutor ju=(JavascriptExecutor)driver;
	  ju.executeScript("window.scrollBy(0,500)");
	  
	  
	  click(public1, "successfully clicked on public");
	  Thread.sleep(3000);
	  
	  click(dentalcare,"successfuly clicked on dental care");
	  Thread.sleep(4000);
	  
	  click(hearingcare, "successfully clicked on hearinfg cae");
	  Thread.sleep(3000);
	  click(hebilativ, "successfully clicked on habuilativ");
	  
	  Thread.sleep(4000);
	  
	  
	  
	  
  }
}
