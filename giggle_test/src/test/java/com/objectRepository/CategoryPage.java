package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class CategoryPage extends ActionEngine{
	
//	public static  By lnk_Category=By.xpath("//a[text()='Arts & Crafts']");
	public static By lnk_Category(String category)
	{
		return By.xpath("//a[text()='"+category+"']");
	}
		
	//page function
	public void clickCategory(String category) throws Throwable
	{
		click(lnk_Category(category), "Category Link");
	}
		
}
