package com.sears.flipkart.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sears.flipkart.Util.Keywords;

public class Footer extends Keywords{

	
	@FindBy(linkText="Careers")
	public static WebElement careersLink;
	
	@FindBy(linkText="Press")
	public static WebElement pressLink;
	
	//---------------------------
	
	public static boolean verifyCareersPage(String expectedTitle){
		String main=null;
		String child=null;
		try{
		click(careersLink);
		Set<String> win= driver.getWindowHandles();
		Iterator it= win.iterator();
		main=it.next().toString();
		child=it.next().toString();
		switchToWindow(child);
		boolean b= verifyPageTitle(expectedTitle);
		driver.close();
		switchToWindow(main);
		return b;
		}catch(Throwable t){
			System.out.println(t.getMessage());
			return false;
		}
	}
	
	public static boolean verifyPressPage(String expectedTitle){
		try{
		click(pressLink);
		return verifyPageTitle(expectedTitle);
		}catch(Throwable t){
			System.out.println(t.getMessage());
			return false;
		}
	}
	
	
}
