package com.sikuki;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;


public class tc01 
{

public WebDriver driver;

  @Test
  public void f() throws FindFailed 
  {
	  Screen vishal=new Screen();
	  Pattern imgcheckout= new Pattern("C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\images\\Capture.PNG");
     Pattern img1=new Pattern("C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\images\\Capture2.PNG");
	Pattern img2=new Pattern("C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\images\\Capture1.PNG");
       vishal.wait(imgcheckout);
       vishal.click(imgcheckout);
	//vishal.type(img1,"toys");
	//vishal.click(img2);
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	 
   System.setProperty("webdriver.chrome.driver","C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	  driver.get("http://www.giggle.com/");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass()
  {
	 // driver.quit();
  }

}
