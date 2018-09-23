package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.eyeglass;
import com.utilities.Xls_Reader;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;

public class eyeglassscrolldown05  extends eyeglass
{
	Xls_Reader reader=new Xls_Reader("TestData/eye.xlsx");
  @Test
  public void f() throws Throwable 
   {
	  type(zipserchtextbox, reader.getCellData("sheet1", "serchterm",3 ), "serch box");
	  
	   boolean zipserch=isEnabled(zipserchtextbox, "serch box ");
	  if (zipserch) 
	  {
		  
		SuccessReport("verify zipserch text box","serch text box is enabled" );
	    click(zipserchbutton, "clickzip serch button");
	    String  serchresult=getText(store,"serch text");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    
	    click(sameday, "click on same day");
	 
		  
	} else 
	{
         failureReport("verify serch text box","serch text box is not enabled" );
	}
	  
  }
}  