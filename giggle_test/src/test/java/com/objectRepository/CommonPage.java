package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class CommonPage extends ActionEngine{
     public By popup          =By.id("x-button");
     public By singin       = By.linkText("SIGN IN");
     public By windowsignin = By.id("dwfrm_login_username");
	public  By imgGiggleLogo = 	By.id("giggle-logo");
	public 	By txtSearchbox = 	By.id("searchTerm");
	public 	By btnSearch 	= 	By.xpath("//input[@type='submit']");
    public By password      =  By.id("dwfrm_login_password");
    public By login         = By.name("dwfrm_login_login");
}

