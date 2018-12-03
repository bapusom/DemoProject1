package com.sears.flipkart.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {

	
	public static WebDriver driver=null;
	public static Properties CONFIG=null;
	public static Properties QUERIES=null;
	
	public static void init() throws IOException{
		if(CONFIG==null){
			CONFIG= new Properties();
			FileInputStream ip= new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\com\\sears\\flipkart\\Config\\test.properties"));
			CONFIG.load(ip);
		
		}
		
		if(QUERIES==null){
			QUERIES= new Properties();
			FileInputStream ip= new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\com\\sears\\flipkart\\Config\\queries.properties"));
			QUERIES.load(ip);
		
		}
	}
	
	
	public static void main(String[] args) {

	}

}
