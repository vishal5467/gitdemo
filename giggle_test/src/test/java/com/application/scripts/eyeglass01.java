package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class eyeglass01  extends eyeglass
{
  @Test
  public void f() throws Throwable 
   {
	  isElementPresent(imgloggo,"verify logo");
	  
	  //click on shopping cart
	  
	  click(shoppingcart, "shopping cart");
	  
	  isElementPresent(yourshoppingcart, "your shopping cart");
	  
	  click(imgloggo, "img loggo");
	  
	  isElementPresent(imgcaroussel, "img caroussel");
	  
	  
	  
	  
	  
  }
}  