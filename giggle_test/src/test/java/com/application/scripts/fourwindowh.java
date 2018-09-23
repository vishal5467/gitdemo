package com.application.scripts;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.objectRepository.bank;

public class fourwindowh extends bank
{
  @Test
  public void f() throws Throwable 
  {
	  click(bankcredit,"successfully clciked bank credit");
		click(subbankandcredit, "successfully subclicked bank and credit");
		
		JavascriptExecutor jf=(JavascriptExecutor)driver;
		jf.executeScript("window.scrollBy(0,400)");
		
		click(discoveronline, "successfully clicked on compare credit card");
		
		Thread.sleep(6000);
		
		JavascriptExecutor ju=(JavascriptExecutor)driver;
		ju.executeScript("window.scrollBy(0,500)");
		
		click(onlinebanking1, "successfully clicked n onlne banking");
		
		JavascriptExecutor ji=(JavascriptExecutor)driver;
		ji.executeScript("window.scrollBy(0,500)");
		
		click(securepaymnet, "successfully clicked on securepaymnet");
		
		JavascriptExecutor jr=(JavascriptExecutor)driver;
		jr.executeScript("window.scrollBy(0,600)");
		
		click(allcheckingaccount, "successfully clicked on all checking account");
		
		Set<String>windowhandle=driver.getWindowHandles();
		String window1=(String)windowhandle.toArray()[0];
		String window2=(String)windowhandle.toArray()[1];
		driver.switchTo().window(window2);
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,900)");
		
		click(checkinaccountwork, "successfully clicked on checking account");
		
		Thread.sleep(9000);
		
		click(ovedraftchoce,"successfully clicked on overdraft");
		Thread.sleep(8000);
		click(savingoverdraft, "successfully clicked on saving overdraft");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		click(greensaving, "successfullly clicked on green saving");
		
		Set<String>windowhndl=driver.getWindowHandles();
		String win1=(String)windowhndl.toArray()[0];
		String win2=(String)windowhndl.toArray()[1];
		String win3=(String)windowhndl.toArray()[2];
		
		driver.switchTo().window(win2);
		
		click(platinumsaving, "successfully cliced on platimnim saving");
		
		Thread.sleep(8000);
		
		Set<String>allwindowhandle=driver.getWindowHandles();
		String wind1= (String)allwindowhandle.toArray()[0];
		String wind2=(String)allwindowhandle.toArray()[1];
		String wind3=(String)allwindowhandle.toArray()[2];
		String wind4=(String)allwindowhandle.toArray()[3];
		
		driver.switchTo().window(wind2);
		
		Thread.sleep(7000);
		click(platinumplus, "successfully clicked on platinum plus");
		
		Thread.sleep(10000);
		Set<String> alwindhn=driver.getWindowHandles();
		String windoe1=(String)alwindhn.toArray()[0];
		String windo2=(String)alwindhn.toArray()[1];
		String windo3=(String)alwindhn.toArray()[2];
		String winf4=(String)alwindhn.toArray()[3];
		String wind5=(String)alwindhn.toArray()[4];
		driver.switchTo().window(windo2);
		Thread.sleep(7000);
		click(comparechoice, "successfully clicked on compare choice");
		Thread.sleep(4000);
		click(closecomparechoice, "successfully cliced on clode comnpare coice");
		Thread.sleep(7000);
		click(compareeligibleaccount, "successfully clikced on elegibleacclount");
		Thread.sleep(6000);
		click(closeelegibleaccont, "successfully clikced on close eligibleaccount");
		
		JavascriptExecutor jp=(JavascriptExecutor)driver;
		jp.executeScript("window.scrollBy(1000,0)");
		
		click(overdraftlineof, "successfully clikced on overdrastline");
		Thread.sleep(9000);
		click(avilablebalance,"successfully clikced on available balance");
		
		Thread.sleep(8000);
		
		click(overdraftcoverage, "successfully clicked on overdraft coverage");
		
		Thread.sleep(7000);
		
		click(checkandpreautorized, "successfully clicked on check and preauthorized paymnet");
		
		JavascriptExecutor jq=(JavascriptExecutor)driver;
		jq.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(8000);
		
//		Actions vis1= new Actions (driver);
//		vis1.moveToElement(driver.findElement(returnitemfee));
//		vis1.click();
//		vis1.perform();
		click(returnitemfee, "succesfully clikced on returnitem feee");
		Thread.sleep(7000);
//		Actions vis=new Actions(driver);
//		vis.moveToElement(driver.findElement(comparechoices));
//		vis.click();
//		vis.perform();
		click(comparechoices, "succesfully clicked on compare coices");
//		JavascriptExecutor jw=(JavascriptExecutor)driver;
//		jw.executeScript("arguments[0].click();",comparechoice);
		
		Thread.sleep(6000);
		click(closecomparechoices, "successfully clicked on compareclkodess");
		Thread.sleep(6000);
		
		JavascriptExecutor jy=(JavascriptExecutor)driver;
		jy.executeScript("window.scrollBy(document.body.scrollHeight,0)");
		
		Thread.sleep(5000);
		click(howyourcheckingaccountworks,"successfully clikcede on how your checjking account work");
		Thread.sleep(6000);
		click(whereandwhenmakedeposite, "successfully clikced on whre and whre");
		Thread.sleep(6000);
		click(whenyourdepositavailanle, "successfully clicked on when deposite avaulable");
		Thread.sleep(5000);
		click(howdebitcardpurchgasework, "successfully clicked on how your debitcard purchase work");
		Thread.sleep(5000);
		click(howtransitionappliedonaccount, "successfully clicked on how transition ");
		Thread.sleep(6000);
		click(managingaccountwisley, "successfuly clicked on managinga account wisley");
		
		Thread.sleep(5000);
		
		
	}
  
}
