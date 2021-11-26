package com.rameshsoft.automation.businessreq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String undata = "";
		FileInputStream fip = new FileInputStream("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\excel\\testdata.xls");
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(3);
		Cell cell = row.createCell(0);
		cell.setCellValue(9);
		Row row1 = sheet.createRow(9);
		row1.createCell(0).setCellValue(10);;
		
		FileOutputStream fop = new FileOutputStream("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\excel\\testdata.xls");
		workbook.write(fop);
		/*for(int i=0;i<sheet.getLastRowNum();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell = row.getCell(j);
				if(cell.getCellType()==CellType.STRING) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if(cell.getCellType()==CellType.NUMERIC) {
					String value = cell.getNumericCellValue()+"";
					System.out.println(value);
				}
				else if(cell.getCellType()==CellType.BOOLEAN) {
					String value = cell.getBooleanCellValue()+"";
					System.out.println(value);
				//System.out.println(cell);	
			}
			}
		}*/
		/*Row row = sheet.getRow(0);
	Cell cell00 = row.getCell(0);
		if(cell00.getCellType()==CellType.STRING) {
			String value = cell00.getStringCellValue();
			System.out.println(value);
		}
		else if(cell00.getCellType()==CellType.NUMERIC) {
			String value = cell00.getNumericCellValue()+"";
			System.out.println(value);
		}
		else if(cell00.getCellType()==CellType.BOOLEAN) {
			String value = cell00.getBooleanCellValue()+"";
			System.out.println();*/
	}

}
