package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase

{
   public int RESPONSE_STATUS_CODE_200 = 200;
   public int RESPONSE_STATUS_CODE_400 = 200;
   public int RESPONSE_STATUS_CODE_201 = 200;
   public int RESPONSE_STATUS_CODE_500 = 200;
   public int RESPONSE_STATUS_CODE_401 = 200;
   
	
	public Properties pr;
	public TestBase()
	{
		
		 try 
		 {
			 pr=new Properties();
				
				FileInputStream fl=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
				
				pr.load(fl);
			
		} catch (FileNotFoundException e)
		 {
			e.printStackTrace();
			
		}
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		
	}

}
