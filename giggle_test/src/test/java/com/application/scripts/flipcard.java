package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.flpcart;
import com.utilities.Xls_Reader;

public class flipcard extends flpcart
{
	
	Xls_Reader reader=new Xls_Reader("TestData/flip.xlsx");
	 
  @Test
  public void f() throws Throwable 
  
  {
	  String strtexe= reader.getCellData("sheet1","serchterm",2);
	  type(serchtextbox,strtexe,"serch text box");
	  click(serchbytton, "serch button");
	  
	  String strtext= getTitle();
	  if (strtext.contains(strtexe)) 
	  {
		  SuccessReport("verify serch page","apporiate page title '" +strtext+ "' is displayrd for the serch term- "+strtexe);
		
	}
	  String strheading=getText(resultheading, "search result heading");
	  if (strheading.equalsIgnoreCase("mobiles")) 
	  {
		SuccessReport("verify serch term","serch term '"+strtexe+"'is found in serch serch result page");
	} else {
          failureReport("verify serch term","serch term '" +strtexe+"'is not found in serch serch result page" );
	
	}
	  
	  click(mobileclick, "click");
  }
  
  
}
