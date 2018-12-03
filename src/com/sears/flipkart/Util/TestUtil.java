package com.sears.flipkart.Util;

import test.Xls_Reader;

public class TestUtil extends Keywords{
	
	public static Object[][] getData(Xls_Reader xls, String sheetName){
		
		int rows= xls.getRowCount(sheetName);
		int cols= xls.getColumnCount(sheetName);
		
		Object[][] data= new Object[rows][cols];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
			data[i][j]=	xls.getCellData(sheetName, j, i+2);
			System.out.println(data[i][j]);
			}
		}
		
		return data;
		
	}
	
	
	
	
	
	
//	public static Connection connectToDB(){
//		 // connect to db
//		// return connection obj
//	}
	
	
//	public static ResultSet fireQuery(String queryKey){
//		// call connectToDB()
//		// read query from queries.properties
//		// // fire statement
//		// retrun resultset
//	}
//	
//	public static getDataFromDB(String columnName){
//		// call fireQuery
//		// loop thru resultsset
//		// rs.getString("EMP_ID"); --columnName
//	}
//	
	
	
	
}
