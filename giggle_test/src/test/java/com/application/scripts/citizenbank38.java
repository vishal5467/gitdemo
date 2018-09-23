package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class citizenbank38 extends bank
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
	  click(homeequityloan, "successfully clicked on homeequity loan");
	  Thread.sleep(5000);
	  click(homeeqiutylearn,"successfully clicked on home euitry learn");
	  Thread.sleep(4000);
	  click(homeequityapply, "successfully clicked on apply now");
	  Thread.sleep(5000);
	  Set<String>windowhandle=driver.getWindowHandles();
	  String window1=(String)windowhandle.toArray()[0];
	  String windiw2=(String)windowhandle.toArray()[1];
	  driver.switchTo().window(windiw2);
	 
	  Thread.sleep(4000);
	 
  	  Select vis1=new Select(driver.findElement(propertyloaction));
	  vis1.selectByIndex(5);
	  click(coapplicant, "succesfully clicked on co applicant");
	  Thread.sleep(4000);
	  driver.findElement(amountrequisted).sendKeys("20000");
	  Thread.sleep(9000);
	  click(loanpurpose1, "successfully clicked on porpose");
//	  Select vis2=new Select(driver.findElement(loanpurpose));
//	  vis2.selectByIndex(0);
	  click(chechall, "succcessfully clicked on check all");
	  Thread.sleep(10000);
	  
	  click(homeloancontinue, "successfully clicked on homeloan contiue");
	  
	  Thread.sleep(7000);
	  driver.findElement(firstname).sendKeys("vishal");
	  Thread.sleep(5000);
	  driver.findElement(birthdate).sendKeys("11241988");
	  
	  JavascriptExecutor jd=(JavascriptExecutor)driver;
	  jd.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(5000);
	  click(conactinfo,"sucessfully clicked on contact info");
	  
	  JavascriptExecutor jf=(JavascriptExecutor)driver;
	  jf.executeScript("window.scrollBy(0,400)");
	  click(primaryresidency, "successfully clicked on primary address");
	  Thread.sleep(4000);
	  
	  
  }
}
