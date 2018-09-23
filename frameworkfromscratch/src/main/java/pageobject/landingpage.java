package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage 
{
	public WebDriver driver;
	
	By signin=By.linkText("Login");
	By title = By.cssSelector("#content > div > div > h2");
	By contact= By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul/li[8]/a");
	
	
	public landingpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}

	public WebElement gettitle()
	{
		return driver.findElement(title);
	}

	public WebElement contactlink()
	{
		return driver.findElement(contact);
	}


}
