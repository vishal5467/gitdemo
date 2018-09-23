package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.eyeglass;
import com.utilities.Xls_Reader;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class eyeglasss07Attribute  extends eyeglass
{
	Xls_Reader reader=new Xls_Reader("TestData/eye.xlsx");
  @Test
  public void f() throws Throwable 
   {
	  String homeoffer=getAttribute(homepageadd,"alt","add is displayed");
	  if (homeoffer.equalsIgnoreCase("Here's a deal as smart as you - 2 pairs of glasses for $78")) 
	{
	  SuccessReport("verifr offer","offer is '"+homeoffer+"' displayed");	
	} else 
	{
      failureReport("verifr offer","offer is not '"+homeoffer+"' displayed");
	}
		click(homepageadd, "successfully clicked");
	
   }  
}  