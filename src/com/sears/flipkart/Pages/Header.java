package com.sears.flipkart.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sears.flipkart.Util.Keywords;

public class Header extends Keywords{

	
	@FindBy(linkText="Sell")
	public static WebElement sellLink;
	
	// driver.findElement(By.linkText("Sell"));
	@FindBy(linkText="Login")
	public static WebElement loginLink;
	
	@FindBy(linkText="Signup")
	public static WebElement signupLink;
	
	@FindBy(id="fk-top-search-box")
	public static WebElement searchTextBox;
	
	@FindBy(xpath="//input[@type='submit' and @value='Search']")
	public static WebElement searchBtn;
	
	@FindBy(partialLinkText="App")
	public static WebElement downloadAppLink;

	@FindBy(partialLinkText="24x7")
	public static WebElement ccLink;
	
	
	
	
	
	
	// --------------------------------   functionalities ---------------------------
	
	
	public static boolean verifySellPage(String expectedTitle){
		try{
		click(sellLink);
		return verifyPageTitle(expectedTitle);
		}catch(Throwable t){
			System.out.println(t.getMessage());
			return false;
		}
	}
	
	
	public static boolean verifyLoginPage(String expectedTitle){
		try{
		click(loginLink);
		return verifyPageTitle(expectedTitle);
		}catch(Throwable t){
			System.out.println(t.getMessage());
			return false;
		}
	}
	
	public static void searchProduct(String product){
		try{
		write(searchTextBox, product);
		click(searchBtn);
		}catch(Throwable t){
			System.out.println(t.getMessage());
		}
	}
	
}
