package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.eyeglass;
import com.utilities.Xls_Reader;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;

public class eyeglass04  extends eyeglass
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
	    if (serchresult.equalsIgnoreCase("Altamonte Springs")) 
	    	
	    {
			SuccessReport("verify zipserchserch result","serch text '"+serchresult+"' box is  displayed");
		} 
	    else 
		{
              failureReport("verify zipserchserch result","serch result '"+serchresult+"' is not displayed" );
		}
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollby(0,document.body.scrollhight)");
	 
		  
	} else 
	{
         failureReport("verify serch text box","serch text box is not enabled" );
	}
	  
  }
}  