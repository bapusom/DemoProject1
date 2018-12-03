package com.sears.flipkart.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.Xls_Reader;

import com.sears.flipkart.Pages.Header;
import com.sears.flipkart.Pages.ProductListing;
import com.sears.flipkart.Util.TestUtil;

public class HeaderTest extends Header{
	
	@Test(description="Verify Sell link works on header")
	public void verifySellPage(){
		Header h= PageFactory.initElements(driver, Header.class);
		boolean b=h.verifySellPage("Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce");
		Assert.assertTrue(b, "Sell Link on Header is broken..");
	
	}
	
	@Test
	public void get(){
		System.out.println(QUERIES.getProperty("getEmployee"));
	}
	
	@Test(description="This test verifies the search product functionality on header.",dataProvider="getSearchData")
	public void verifySearchProduct(String searchProduct, String expectedText){
		Header h= PageFactory.initElements(driver, Header.class);
		h.searchProduct(searchProduct);
		ProductListing pl= PageFactory.initElements(driver, ProductListing.class);
		boolean b=pl.verfiySearchTextDisplayed(expectedText);
		Assert.assertTrue(b, " Results for "+searchProduct+" was not displayed on Product Listing page.");
	}
	
	@DataProvider
	public static Object[][] getSearchData(){
		Xls_Reader xls= new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\sears\\flipkart\\Xls\\SearchTest.xlsx");
		return TestUtil.getData(xls, "Search");
	}

}
