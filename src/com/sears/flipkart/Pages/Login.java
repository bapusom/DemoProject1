package com.sears.flipkart.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sears.flipkart.Util.Keywords;

public class Login extends Keywords{

	@FindBy(id="uname")
	public static WebElement unameTextBox;
	
	@FindBy(id="password")
	public static WebElement pwdTextBox;
	
	@FindBy(id="loginBtn")
	public static WebElement loginBtn;
	
	//----------------------------- 
	
	public static boolean doLogin(String uname, String pwd){
		try{
		write(unameTextBox, uname);
		write(pwdTextBox, pwd);
		click(loginBtn);
		
	return verifyPageTitle("Welcome");
		}catch(Throwable t){
			System.out.println(t.getMessage());
			return false;
		}
	
	}
	
	
}
