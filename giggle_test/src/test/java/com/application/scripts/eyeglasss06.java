package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.eyeglass;
import com.utilities.Xls_Reader;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class eyeglasss06  extends eyeglass
{
	Xls_Reader reader=new Xls_Reader("TestData/eye.xlsx");
  @Test
  public void f() throws Throwable 
   {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(eyeexamlink)).perform();
	 
	  
	  Thread.sleep(3000);
	  bar.moveToElement(driver.findElement(offerslink)).perform();
	 Thread.sleep(4000);
	  bar.moveToElement(driver.findElement(lowcost));
	  click(lowcost, "clicked on link");
   }  
}  