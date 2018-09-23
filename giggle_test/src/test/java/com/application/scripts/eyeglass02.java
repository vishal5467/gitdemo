package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.eyeglass;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;

public class eyeglass02  extends eyeglass
{
  @Test
  public void f() throws Throwable 
   {
	//for verify text we use gettext 
	  String logani= getText(logan, "text is displayed");	  
		
	if (logani.equalsIgnoreCase("See1 yourself smile. See yourself save.®"))
	{
		SuccessReport(" verify logo is displayed","logo is displayed") ;
	} else
	{
        failureReport("verify logo","logo is not displayed");
        getscreenshot();
	}
	  
	  
	  
  }

private void getscreenshot() throws IOException 
{
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File("C:\\Users\\computer\\Desktop\\Hybrid_Training\\giggle_test\\src\\screenshot.jpg1"));
	
}
}  