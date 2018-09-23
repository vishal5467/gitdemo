package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bcbs;

public class bcthreewindow10 extends bcbs
{
  @Test
  public void f() throws Throwable
  {
	  Actions bar=new Actions (driver);
	  bar.moveToElement(driver.findElement(findplan)).perform();
	  bar.moveToElement(driver.findElement(medicare)).perform();
	  click(medicare, "successfully clikced medicare");
	  click(medicareadvanceplan,"successfully lciked on medicareplan");
	  
	  Thread.sleep(10000);
 WebElement popupwindow=driver.findElement(popup1);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();",popupwindow);
	  Thread.sleep(5000);
	  JavascriptExecutor jo=(JavascriptExecutor)driver;
	  jo.executeScript("window.scrollBy(0,1000)");
	  
	  click(viewextendsplan, "successfully clicke on view extends plan");
	  
	  Thread.sleep(7000);
	 JavascriptExecutor jd=(JavascriptExecutor)driver;
	 jd.executeScript("window.scrollBy(0,1800)");
	 
	  
	  click(viewplandetail,"successfully clicked on plan detailed");
	  Thread.sleep(1800);
	  JavascriptExecutor jf=(JavascriptExecutor)driver;
	  jf.executeScript("window.scrollBy(0,2000)");
	  
	  click(findpharmacy, "successfully lciked on find pharmacy");
	  
	  Thread.sleep(7000);
	  String window1=driver.getWindowHandle();
	  System.out.println("first window is "+window1);
	  
	  String window2=driver.getWindowHandle();
	  System.out.println("2nd window is" +window2);
	  
	  Set<String>windohandle=driver.getWindowHandles();
	  System.out.println("no of window is" +windohandle.size());
	  System.out.println("both id are" +windohandle);
	
	  windohandle.remove(window1);
	  driver.switchTo().window(windohandle.iterator().next());
	  JavascriptExecutor jl=(JavascriptExecutor)driver;
	  jl.executeScript("window.scrollBy(0,1000)");
	  
	  click(findapharmacy, "successfully clicked on find a pharmacy");
	  
	  Thread.sleep(4000);
	  org.openqa.selenium.Alert vishal=driver.switchTo().alert();
	  System.out.println("title of alert is" +vishal.getText());
	  vishal.accept();
	 Set<String>allwindowshanles=driver.getWindowHandles();
	 String winow1=(String) allwindowshanles.toArray()[0];
	 String winow2=(String)allwindowshanles.toArray()[1];
	 String winow3=(String)allwindowshanles.toArray()[2];
	 
	 driver.switchTo().window(winow3);
	 
	 WebElement localphaarmacy1=driver.findElement(localpharmacy);
	  
	  localphaarmacy1.sendKeys("32763");
	  
	  Thread.sleep(10000);
	  
	  driver.switchTo().window(winow2);
	  click(medicareppo, "successfully lciked on medicare ppo");
	  
	  Thread.sleep(5000);
	  
	  
  }
}
