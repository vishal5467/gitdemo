package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank43 extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,800)");
	  click(specifieyourloaction, "successfully clicked on location");
	  Thread.sleep(3000);
	  driver.findElement(zipinput).sendKeys("02904");
	  Thread.sleep(7000);
	  click(submit2, "successfdully clicked on submiot");
	  Thread.sleep(5000);
	  JavascriptExecutor jp=(JavascriptExecutor)driver;
	  jp.executeScript("window.scrollBy(1000,0)");
	  Thread.sleep(2000);
	  click(borrowing, "successfully clicked on borrowing");
	  Thread.sleep(3000);
	  click(personalloan,"successfully clicked on personal loan");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,2000)");
	  click(calculatepaymnet, "successfully clicked on payment");
	  driver.switchTo().frame(0);
	  click(heighrescore,"successfully clicked on heigher score");
	  Thread.sleep(5000);
	  click(fouryears, "successfully clicked on four years");
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,700)");
	  Thread.sleep(7000);
	  click(applyi, "successfully clicked on apply");
	  Thread.sleep(7000);
	  
  }
}
