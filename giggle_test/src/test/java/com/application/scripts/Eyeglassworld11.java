package com.application.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class Eyeglassworld11 extends eyeglass
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar= new Actions(driver);
	  bar.moveToElement(driver.findElement(contactlence)).perform();
	  bar.moveToElement(driver.findElement(cotanctlencediscount)).perform();
	  click(cotanctlencediscount, "successfully clickes");
	  String contacttext=getText(contactlencetext, "text is");
	  if (contacttext.equalsIgnoreCase("Sofmed 55")) 
	  {
		  SuccessReport("verify text","text is'"+contacttext+"'displayed");
		
	} else {
           failureReport("verify text","text is not'"+contacttext+"' diplayed");
	
	}
	  WebElement lense=driver.findElement(rightcontactlence);
	  Select vishal=new Select(lense);
	  vishal.selectByVisibleText("-5.00");
	  WebElement llense=driver.findElement(leftcontact);
	  Select vishal1=new Select(llense);
	  vishal1.selectByVisibleText("-5.50");
	  Thread.sleep(6000);
	  click(lenseshoppingcart,"successfully clicked");
	  String lensetexr=getText(lenseshoppingtext,"test is" );
	  if (lensetexr.equalsIgnoreCase("Your Shopping Cart")) 
	  {
		SuccessReport("verify text","success fully displayed '"+lensetexr+"' ");
	} else {
          failureReport("verify text","not displayed text is '"+lensetexr+"'");
	}
			  click(lensecheckout, "successfully checkout");
		String lenseshoppingcarttext=getText(lensestextshoppingcart,"text is");
		if (lenseshoppingcarttext.equalsIgnoreCase("Your Shopping Cart")) 
		{
			SuccessReport("verify shopping cart text","shopping cart text is'"+lenseshoppingcarttext+"'" );
		} else {
             failureReport("verify shopping cart text","shopping cart text is not displayed'"+lenseshoppingcarttext+"'");
		
		}
		WebElement enteremailshoppingcart=driver.findElement(shoppingemailid);
		enteremailshoppingcart.sendKeys("vishalns24@gmail.com");
		WebElement enterpassword=driver.findElement(shoppingpassword);
		enterpassword.sendKeys("vishalshah");
		click(shoppinglogin,"successfully clicked");
		
		String lenseaccount=getText(lencecreataccount,"text is" );
		
		if (lenseaccount.equalsIgnoreCase("Create A New Eyeglass World Account")) 
		{
			SuccessReport("verify text","succesfully displayed text is'"+lenseaccount+"'");
			
		} else {
              failureReport("verify text","succesfully not displayed text is'"+lenseaccount+"'");
		}
  }
  
  
  
}
