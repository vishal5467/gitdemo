package com.application.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.framework;

public class Draganddrop extends framework
{
  @Test
  public void f() throws InterruptedException 
  {
	  driver.switchTo().frame(0);
	  WebElement dr=driver.findElement(big);
	  WebElement dro=driver.findElement(small);
	  Actions bar=new Actions(driver);
	  bar.dragAndDrop(dr, dro).build().perform();
	  Thread.sleep(4000);
  }
}
