package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class spicejet extends ActionEngine


{
  public By  verifylogo= By.xpath("//a[@class='spicejet_logo']");
  public By  addon     =By.linkText("About Us");
  public By   spiceroot=By.xpath("//a[contains(.,'Spice Route Magazine')]");
  public By   jun      =By.linkText("June 2017");
  //public By   selectbox=By.id("")
  public By  adultdropdown= By.id("ctl00_mainContent_ddl_Adult");
}
