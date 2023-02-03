package com.exten;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginOutputStatus {

	public static void main(String[] args) throws IOException {

		File file = new File("./src/test/resources/loginOutput.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("LoginOutput");
		Row createRow = sheet.createRow(4);
		Cell createCell = createRow.createCell(4);
		createCell.setCellValue("true");
		FileOutputStream stream = new FileOutputStream(file);
		book.write(stream);
		
		Sheet sheet1 = book.getSheet("LoginOutput");
		for(int i=0;i<sheet1.getPhysicalNumberOfRows();i++) {
			Row row = sheet1.getRow(i);
			for(int j=0;j<sheet1.getPhysicalNumberOfRows();j++) {
				
			}
		}
	}
}