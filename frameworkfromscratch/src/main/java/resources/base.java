package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 

{
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializedriver() throws IOException
	{
		
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\computer\\Desktop\\Hybrid_Training\\frameworkfromscratch\\src\\main\\java\\resources\\data.properties");
		
		
		prop.load(fis);
	String browsername=	prop.getProperty("browser");
	System.out.println(browsername);
	
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\computer\\Desktop\\Hybrid_Training\\Javapractice_Training\\library\\chromedriver.exe");
		    driver=new ChromeDriver();
		//	driver.get("http://www.qaclickacademy.com/index.php");
			
		}
		else if(browsername.equals("forefox"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\computer\\Desktop\\Hybrid_Training\\Javapractice_Training\\library\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		}
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	
	
	
	}
	public void getscreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\computer\\Desktop\\Hybrid_Training\\screenshot\\"+result+"vishal.png"));
		
		
	}
}
