package com.rameshsoft.automation.Supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.batik.anim.timing.SyncbaseTimingSpecifier;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.rameshsoft.automation.Utilities.Filepaths;

public class ExcelReader {
	
	private String Filepath;
	private FileInputStream fip;
	private Workbook  workbook;
	private org.apache.poi.ss.usermodel.Sheet sheet;
	private Row row;
	private Cell cell; 
	private String value;
	
	public ExcelReader(String Filepath) throws EncryptedDocumentException, IOException {
		this.Filepath = Filepath;
		 fip = new FileInputStream(Filepath);
		  workbook = WorkbookFactory.create(fip);
	}
	
	public org.apache.poi.ss.usermodel.Sheet getsheetobj(String how,String howvalue) {
		if(workbook!=null) {
			if(how.equalsIgnoreCase("SheetName")) {
			sheet	 = workbook.getSheet(howvalue);
			}
			else if(how.equalsIgnoreCase("index")) {
			int sheetint	= Integer.parseInt(howvalue);
			sheet = workbook.getSheetAt(sheetint);
			}
		}
		else {
			System.out.println("Sheetis pointing to null");
		}
		return sheet;
		
	}
	
	
	public List<String> getRowdata(String how,String howvalue,int rownum){
		List<String> rowdata = new ArrayList<String>();
		sheet = getsheetobj(how, howvalue);
		if(sheet!=null) {
		 row = 	sheet.getRow(rownum);
			if(row!=null) {
				for(int i=0;i<row.getLastCellNum();i++) {
				cell =	row.getCell(i);
				if(cell.getCellType()==CellType.STRING) {
					value = cell.getStringCellValue();
					rowdata.add(value);
				}
				else if(cell.getCellType()==CellType.NUMERIC) {
					 value = cell.getNumericCellValue()+"";
					 rowdata.add(value);
				}
				else if(cell.getCellType()==CellType.BOOLEAN) {
					 value = cell.getBooleanCellValue()+"";
					 rowdata.add(value);
			}
				}
			}
		}
		else {
			System.out.println("sheet is pointing to null");
		}
		return rowdata;
	}

	public String getsinglecelldata(String how,String howvalue,int rownum,int cellval) {
		sheet = getsheetobj(how, howvalue);
		if(sheet!=null) {
		row = 	sheet.getRow(rownum);
		if(row!=null) {
		cell =	row.getCell(cellval);
		if(cell.getCellType()==CellType.STRING) {
			value = cell.getStringCellValue();
		
		}
		else if(cell.getCellType()==CellType.NUMERIC) {
			 value = cell.getNumericCellValue()+"";
		}
		else if(cell.getCellType()==CellType.BOOLEAN) {
			 value = cell.getBooleanCellValue()+"";
			 
	}
		}
		}
		return value;
	}
	public List<String> sheetdata(String how,String howvalue){
		List<String> sheetdata = new ArrayList<String>();
		sheet = getsheetobj(how, howvalue);
		if(sheet!=null) {
			for(int i=0;i<sheet.getLastRowNum();i++) {
				row = sheet.getRow(i);
				if(row!=null) {
					for(int j=0;j<row.getLastCellNum();j++) {
					cell =	row.getCell(j);
					if(cell.getCellType()==CellType.STRING) {
						value = cell.getStringCellValue();
						sheetdata.add(value);
					
					}
					else if(cell.getCellType()==CellType.NUMERIC) {
						 value = cell.getNumericCellValue()+"";
						 sheetdata.add(value);
					}
					else if(cell.getCellType()==CellType.BOOLEAN) {
						 value = cell.getBooleanCellValue()+"";
						 sheetdata.add(value);
				}
					
					}
				}
			}
		}
		return sheetdata;
	}
	
	public Set<String> uniquesheetdata(String how,String howvalue){
		List<String> list = sheetdata(how, howvalue);
		Set<String> setdata = new HashSet<>();
		setdata.addAll(list);
		return setdata;
	}

/*	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelReader ex = new ExcelReader(Filepaths.Excelpath);
		System.out.println(ex.uniquesheetdata("index", "1"));
		System.out.println(ex.sheetdata("index", "1"));
		
	}*/
}
