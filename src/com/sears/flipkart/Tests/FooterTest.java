package com.sears.flipkart.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sears.flipkart.Pages.Footer;

public class FooterTest extends Footer{

	@BeforeMethod
	public static void beforeMethod(){
		navigate("TestUrl");
	}
	
	@Test
	public void verifyCareersPageOnFooter(){
		Footer f= PageFactory.initElements(driver, Footer.class);
		boolean b=f.verifyCareersPage("Flipkart Careers");
		Assert.assertTrue(b, "Flipkart Careers page was not displayed");
	}
}
