package com.tricentis.automobiles.pages;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tricentis.utilities.Xls_Reader;

public class TestDataUsingHashtable {
	
	//create excel instance object
	public static Xls_Reader excel = null;
	
	@Test(dataProvider="getData")
	public void tricentisdatanew(Hashtable <String,String> data) {
		
		System.out.println(data.get("ussername"));
		
	}
	@DataProvider
	public static Object[][] getData(){
		
		if(excel==null) {
			
			//load the excel here
			excel = new Xls_Reader("C:\\Users\\salma\\eclipse-workspace\\TestNGPractice\\user.xlsx");
		}
		
		//Enter the sheet name
		String sheetName = "Infodata";
		
		//get the total number of rows in sheet
		int rows = excel.getRowCount(sheetName);
		
		//get the total number of coloum in the sheet 
		int cols = excel.getColumnCount(sheetName);
		
		System.out.println(rows);
		System.out.println(cols);
		
		Object[][] data = new Object[rows-1][1];
		
		//create the object of the hashtable
		Hashtable<String,String> table = null; 
		
		//first loop for the row
		for(int rowNum=2; rowNum<=rows;rowNum++) {
			
			//create the hashtable for every row
			table = new Hashtable<String,String>();
			
			for(int colNum=0; colNum<cols;colNum++) {
				
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				
				data[rowNum-2][0] = table;
				
				
			}
		}
		
		return data;
	}

}
