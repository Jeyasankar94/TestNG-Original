package com.exten;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("LoginOutputDetails");
		
/*		//Method Type - 1
		Object loginData[][] = { 
				{"EmailId", "Password"},
				{"Ragava@visionias", "pass123"},
				{"Nalin@visionias", "pass789"},
				{"jeyas@visionias", "pass654"},
				{"jeyasvisions", "pass768"}
		};

		//using for loop
		int rows = loginData.length;
		int cols = loginData[0].length;

		System.out.println(rows);
		System.out.println(cols);

		//	METHOD=1	//iterating row
		for(int r=0; r<rows;r++) {
			XSSFRow row = sheet.createRow(r);
			//iterating column
			for(int c=0;c<cols;c++)	{
				XSSFCell cell = row.createCell(c);
				Object value = loginData[r][c];

				if(value instanceof String)//value is in the form of object so convert into string by typecasting
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}

		String filePath = ".\\datafiles\\loginOutput1.xlsx";
		FileOutputStream outputstream = new FileOutputStream(filePath);
		workbook.write(outputstream);

		outputstream.close();

		System.out.println("LoginOutput.xlsx file written successfully"); 
*/		
/**************************************************************************************************/
				//Method Type - 2
/*************************************************************************** 	
* 			Object loginData[][] = { 
				{"EmailId", "Password"},
				{"Ragava@visionias", "pass123"},
				{"Nalin@visionias", "pass789"},
				{"jeyas@visionias", "pass654"},
				{"jeyas@visionias", "pass768"}
		};

		//using for loop
		int rows = loginData.length;
		int cols = loginData[0].length;

		System.out.println(rows);
		System.out.println(cols);

			// METHOD=2   //Using enhanced for loop it is not index based 
		int rowcount = 0;
		for(Object log[]:loginData) {
			XSSFRow row = sheet.createRow(rowcount++);

			int columncount = 0;
			for(Object value:log) {
				XSSFCell cell = row.createCell(columncount++);

				if(value instanceof String)//value is in the form of object so convert into string by typecasting
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}  

		String filePath = ".\\datafiles\\loginOutput2.xlsx";
		FileOutputStream outputstream = new FileOutputStream(filePath);
		workbook.write(outputstream);

		outputstream.close();

		System.out.println("LoginOutput.xlsx file written successfully"); 
		
*********************************************************************************/



					//Method Type - 3
		  	//  METHOD=2 for storing data  
		ArrayList<Object[]> loginData = new ArrayList<Object[]>();

		loginData.add(new Object[] {"EmailId", "Password"});
		loginData.add(new Object[] {"Ragava@visionias", "pass123"});
		loginData.add(new Object[] {"jeyas@visionias", "pass654"});
		loginData.add(new Object[] {"jeyas@visionias", "vision123"});

		// METHOD=3   //Using enhanced for loop it is not index based 
		int rownum = 0;
		for(Object[] log:loginData) {
			XSSFRow row = sheet.createRow(rownum++);

			int cellnum = 0;
			for(Object value:log) {
				XSSFCell cell = row.createCell(cellnum++);

				if(value instanceof String)//value is in the form of object so convert into string by typecasting
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}  
		String filePath = ".\\datafiles\\loginOutput3.xlsx";
		FileOutputStream outputstream = new FileOutputStream(filePath);
		workbook.write(outputstream);

		outputstream.close();

		System.out.println("LoginOutput.xlsx file written successfully"); 

	}

}
