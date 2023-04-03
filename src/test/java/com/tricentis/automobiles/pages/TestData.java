package com.tricentis.automobiles.pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tricentis.utils.Xls_Reader;

public class TestData {
	
	public static Xls_Reader excel = null;
	
	@Test(dataProvider="getData")
	public void tricentisValidation(String Value1) {
		
		System.out.println("The value is "+Value1);
		
	}
	
	@DataProvider
	public static Object[][] getData() {
		
		if(excel==null) {
			excel = new Xls_Reader("C:\\Users\\salma\\eclipse-workspace\\TestNGPractice\\tricentisdata.xlsx");
			
		}
		
		String sheetName = "Info";
		int rows = excel.getRowCount(sheetName);
		System.out.println(rows);
		
		int cols = excel.getColumnCount(sheetName);
		System.out.println(cols);
		
		Object[][] data = new Object[rows-1][cols];
		for(int rowNum =2; rowNum<=rows; rowNum++) {
			for(int colNum =0; colNum<cols; colNum++) {
				data [rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		
		return data;
	}

}
