package com.hyr.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	@DataProvider
	public String[][] getData() throws Exception {
		File excelFile = new File("./src/test/resources/TestingSample.xlsx");
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noOfRows-1][noOfColumns];
		for(int i=0; i<noOfRows-1;i++ ) {
			for(int j=0;j<noOfColumns;j++) {
				//we can read any type(String,Integer,long,..) of data by using DataFormatter
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}		
		//To avoid data leakage
		workbook.close();
		fis.close();
		return data;
	}
}
