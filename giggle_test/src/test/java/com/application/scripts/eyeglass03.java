package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.eyeglass;
import com.utilities.Xls_Reader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class eyeglass03  extends eyeglass
{
	Xls_Reader reader=new Xls_Reader("TestData/eye.xlsx");
  @Test
  public void f() throws Throwable 
   {
	  type(serch, reader.getCellData("sheet1", "serchterm",2 ), "serch box");
	//for verify text we use gettext 
	  String logani= getText(logan, "text is displayed");	  
		
	if (logani.equalsIgnoreCase("See yourself smile. See yourself save.®"))
	{
		SuccessReport(" verify logo is displayed","logo is displayed") ;
	} else
	{
        failureReport("verify logo","logo is not displayed");
	}
	  
	  boolean serchterm=isEnabled(serch, "serch box ");
	  if (serchterm) 
	  {
		  
		SuccessReport("verify serch text box","serch text box is enabled" );
	    click(serchbutton, "click serch button");
	    String  serchresult=getText(serchtext, "serch text");
	    if (serchresult.equalsIgnoreCase("sunglass")) 
	    {
			SuccessReport("verify serch result","serch text box is'"+serchresult+"' displayed");
		} else {
              failureReport("verify serch result","serch result '"+serchresult+"' is not displayed" );
		}
	 
		  
	} else 
	{
         failureReport("verify serch text box","serch text box is not enabled" );
	}
	  
  }
}  