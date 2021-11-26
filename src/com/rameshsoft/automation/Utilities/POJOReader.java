package com.rameshsoft.automation.Utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.rameshsoft.automation.Supporters.ExcelReader;
import com.rameshsoft.automation.Supporters.PropertiesReaders;

public class POJOReader {
	
	public static PropertiesReaders getconfig() throws IOException {
		PropertiesReaders prCON = new PropertiesReaders(Filepaths.configpath);
		return prCON;
		
	}
	public static PropertiesReaders getOR() throws IOException {
		PropertiesReaders pror = new PropertiesReaders(Filepaths.ORpath);
		return pror;
		
	}
	public static ExcelReader getexcel() throws EncryptedDocumentException, IOException {
		ExcelReader exrd = new ExcelReader(Filepaths.Excelpath);
		return exrd;
	}

}
