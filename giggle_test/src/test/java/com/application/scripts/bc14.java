package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bc14 extends bcbs
{
  @Test
  public void f() throws Throwable
  {
	  click(serch, "successfully clicked on serch");
	  
	  WebElement serchtext=driver.findElement(serch);
	  System.out.println("text is" +serchtext.getText());
	 serchtext.sendKeys("ppo");
	 click(serchbutton,"successfully clickedd on serch button");
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 
	 click(page3, "successfullu lcikcen on page 3");
	 
	 Thread.sleep(7000);
	 JavascriptExecutor jo=(JavascriptExecutor)driver;
	 jo.executeScript("window.scrollBy(4000,0)");
	 
	 click(home, "successfully clicked on home");
	 click(bcucarelogo, "successfully clicked on logo");
	 
	 org.openqa.selenium.Alert vishal=driver.switchTo().alert();
	 vishal.accept();
	 
	 Set<String>windoehandle=driver.getWindowHandles();
	 String winow1=(String)windoehandle.toArray()[0];
	 
	 String window2=(String)windoehandle.toArray()[1];
	 driver.switchTo().window(window2);
	 click(contactus, "successfully clikken on contact us");
	 Thread.sleep(5000);
	 
  }
  
}
