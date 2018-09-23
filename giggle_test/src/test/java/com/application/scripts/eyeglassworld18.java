package com.application.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

public class eyeglassworld18  extends eyeglass
{
  @Test
  public void f() throws Throwable
  {
	  WebElement zip= driver.findElement(gozip);
			  zip.sendKeys("32763");
	  click(gobuttn, "successfully cliced on go button");
	  
	  Thread.sleep(15800);
	  //click(commingsoon, "clicked on commingsoon");
	  //click(altamon, "successfully clicked on altamon");
	//  click(scheduleeyeexam,"sucessfully clicked on eyexam");
	  
	  Screen vishal=new Screen();
	  Pattern img1=new Pattern("C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\images\\Capture.PNG");
	  Pattern img2=new Pattern("C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\images\\Capture3.PNG");
	  Pattern img3=new Pattern("C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\images\\Capture4.PNG");
	  vishal.click(img1);
	vishal.click(img2);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,3000)");
	
	  vishal.click(img3);
	  
	//  JavascriptExecutor js=(JavascriptExecutor)driver;
	 // js.executeScript("window.scrollBy(0,2000)");
	  Thread.sleep(8000);
	  
	  
	  String windh=driver.getWindowHandle();
	  System.out.println("window id is"+windh);
	  
	  
  }
}
