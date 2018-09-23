package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class LoginPage extends ActionEngine
{
	
	public By lnkSignIn = By.linkText("SIGN IN");
	public By txtEmailAddress = By.id("email");
	public By txtPassword = By.id("pass");
	public By btnSignIn = By.id("send2");
	public By LoginErrorMessage = By.xpath("//li[@class='error-msg']/ul/li/span");
	

}
