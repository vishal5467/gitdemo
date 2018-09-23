package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc13 extends bcbs
{
  @Test
  public void f() throws Throwable
  {
	  click(serch, "successfully clicked on serch");
	  
	  String serchtext=driver.findElement(serch).getAttribute("placeholder");
	  System.out.println("text is" +serchtext);
	  if (serchtext.equalsIgnoreCase("Search our site")) 
	  {SuccessReport("verify serchbutton","serch button name is'"+serchtext+"'");
		
	} else 
	{
       failureReport("verefy serch is","serch button name is not'"+serchtext+"'" );
	}
     
       
  }
  
  
}
