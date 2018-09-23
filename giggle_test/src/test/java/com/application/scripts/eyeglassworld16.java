package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld16 extends eyeglass
{
  @Test
  public void f() throws Throwable 
  {
	  Actions bar=new Actions(driver);
	  bar.moveToElement(driver.findElement(visioninsurance)).perform();
	  click(visioninsurance, "successfully clicked");
	  click(eyeexam,"successfully clicked");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	//  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  js.executeScript("window.scrollBy(0,500)");
	  click(scheduleeyeexam, "successfully clicked");
	 // WebElement city=driver.findElement(entercity);
	 // city.sendKeys("orangecity");
	  
	 // Select vishal=new Select(driver.findElement(state));
	//  vishal.selectByVisibleText("FL");
	  WebElement zipcode=driver.findElement(gozip);
	  zipcode.sendKeys("32763");
	  Thread.sleep(4000);
	  
	  //click(gobuttn, "successfuly clicked");
	  click(zipserchbutton, "clickzip serch button");
	 // JavascriptExecutor jk = (JavascriptExecutor)driver;
	  //jk.executeScript("arguments[0].click();",gobuttn );
	  Thread.sleep(14000);
	 // JavascriptExecutor jv=(JavascriptExecutor)driver;
	  //jv.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	 
	  click(daytonabeac,"succesfully clicked altamonspring");
	  Thread.sleep(6000);
  }
}
