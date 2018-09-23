package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc15 extends  bcbs
{
  @Test
  public void f() throws Throwable
  {

	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(medicareandstate)).perform();
	  click(medicareandstate, "successfuly clicked on plan");
	  
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,1000)");
	  
	  click(doctor, "successfully clicked on doctor");
	  click(finddoctor, "successfully lcikked on fing cdocter");
	  
	  org.openqa.selenium.Alert vishal1=driver.switchTo().alert();
	  vishal1.accept();
	  Set<String>windowhandle=driver.getWindowHandles();
	  String window1=(String)windowhandle.toArray()[0];
	  String window2=(String)windowhandle.toArray()[1];
	  driver.switchTo().window(window2);
	  click(all, "successfilly clicked on all");
	  click(mentalhealth,"successfully clicked on mentalk helth");
	  Thread.sleep(5000);
	 // driver.findElement(mentalserch).sendKeys("suneeta tiku");
	  
	  driver.findElement(mentalzip).sendKeys("48002");
	  click(mentalserchbutton, "successfully clicked on mental serch button");
	  
	  Thread.sleep(25000);
	  click(mentalhealthfilter, "successfully clicked on mental mhealth");
	  click(filter2,"successfullyu lciked on filter");
	  Thread.sleep(20000);
	  JavascriptExecutor ko=(JavascriptExecutor)driver;
	  ko.executeScript("window.scrollBy(0,300)");
	  click(clooindoctor, "sucessfuully cliced");
	  
	  JavascriptExecutor jh=(JavascriptExecutor)driver;
	  jh.executeScript("window.scrollBy(0,3000)");
	  
	  click(naranyan, "successfully clciked on narayan");
	  click(compareserch,"successfuly clckded on  serch");
	  
	  Thread.sleep(10000);
	  driver.switchTo().window(window1);
	  
	  Thread.sleep(9000);
	  click(findapharmacy1,"successfully lciked");
	  
	  org.openqa.selenium.Alert vishal2=driver.switchTo().alert();
	  vishal2.accept();
	  
	  Set<String>allwindowhandle=driver.getWindowHandles();
	  String windo1=(String)allwindowhandle.toArray()[0];
	  String winow2=(String)allwindowhandle.toArray()[2];
	  driver.switchTo().window(winow2);
	  Thread.sleep(10000);
	  Select bar1=new Select(driver.findElement(pharmacyselect));
	
	  //fllorida not select because firstr is empty
	  
	  
	  bar1.selectByIndex(8);
	  Select bar2=new Select(driver.findElement(distancephar));
	  bar2.selectByIndex(0);
	  Thread.sleep(2000);
	  
	  
	  driver.findElement(pharmacyselect).sendKeys("32763");
	  click(pharmacrbutton,"sucessfully clicked on button");
	  
	  
	Thread.sleep(20000);  
  }
  
}
