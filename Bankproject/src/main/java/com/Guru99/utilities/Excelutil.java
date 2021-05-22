package com.Guru99.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	static XSSFSheet sheet;
	
	public static void intializeproperty() throws IOException {
		File file=new File("C:\\Codebase\\Bankproject\\Resources\\config\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		
		sheet=wbook.getSheet("TestData");
		
		
	}
	public static String readData(int row,int col) {
		String cellvalue=sheet.getRow(row).getCell(col).getStringCellValue();
		return cellvalue;
	}

}

