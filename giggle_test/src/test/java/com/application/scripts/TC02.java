package com.application.scripts;

import org.testng.annotations.Test;
import com.objectRepository.CommonPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC02 extends CommonPage{

	
	SearchResPage sr = new SearchResPage();
	Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the functionality of searching a product
	 * @param Product
	 * @throws Throwable
	 */
	@Test
	public void testTC02() throws Throwable{
		boolean bFlag = false;
		
		try {
			
			boolean logoflag = isElementDisplayed(driver.findElement(imgGiggleLogo));
			if (logoflag) {
				SuccessReport("Verify Logo display", "Giggle logo is displayed");
				String display=getText(imgGiggleLogo, "Writen img loggo");
			} else {
				failureReport("Verify Logo display", "Giggle logo is not displayed");	
			}
			//Enter the product name in the search text box
			type(txtSearchbox, reader.getCellData("Sheet1", "SearchTerm", 2), "Search Textbox");
			
			click(btnSearch, "Search button"); //Click on Search button
					
			boolean lnkToysFlag = isElementDisplayed(driver.findElement(sr.lnkToys));
			//Check the product display
			if (lnkToysFlag) {
				SuccessReport("Verify Product display", "Appropriate product is displayed");
				 bFlag = true;
			} else {
				failureReport("Verify Product display", "Failed to display the product");	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			if (bFlag) {
				SuccessReport("Verify Product Search", "Successfully searched the product");
			} else {
				failureReport("Verify Product Search", "Failed to search the product");	
			}
			
		}
		
		
		

	}
}
