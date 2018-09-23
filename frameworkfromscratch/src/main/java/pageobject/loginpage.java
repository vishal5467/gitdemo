package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage 
{
public 	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	 By uname=By.id("user_email");
	 By password=By.id("user_password");
	 By loginbutyon=By.name("commit");
	 
	 public WebElement username()
	 {
		return driver.findElement(uname);
	 }
	 
	 public WebElement pass()
	 {
		  return driver.findElement(password);
	 }

	 public WebElement logbutton()
	 {
		return driver.findElement(loginbutyon);
	 }
}
