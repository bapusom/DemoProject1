package com.sears.flipkart.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sears.flipkart.Util.Keywords;

public class ProductListing extends Keywords{

	
	
	
	@FindBy(xpath="//*[@id='selectedFilters']/div/a")
	public static WebElement searchedForText;
	
	//------------------------------
	
	
	public static boolean verfiySearchTextDisplayed(String expectedText){
		try{
		String actualText=getElementText(searchedForText).trim();
		if(actualText.equalsIgnoreCase(actualText)){
			return true;
		}else {
			return false;
		}
		}catch(Throwable t){
			System.out.println(t.getMessage());
			return false;
		}
		
	}
	
	
	
	
}
