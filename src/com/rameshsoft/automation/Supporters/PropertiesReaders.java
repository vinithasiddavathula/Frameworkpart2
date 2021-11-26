package com.rameshsoft.automation.Supporters;

import java.beans.PropertyEditorSupport;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaders {
	
	private String Filepath;
	private Properties properties;
	private FileInputStream Fip;
	private String value;
	
	public PropertiesReaders(String Filepath) throws IOException {
		this.Filepath = Filepath;
		 Fip = new FileInputStream(Filepath);
		 properties = new Properties();
		properties.load(Fip);
	}
	
	
	public String getvalue(String key) {
		if(properties!=null) {
		 value =	properties.getProperty(key);
		}
		else {
			System.out.println("value is null");
		}
		return value;
	}
	public String getvalue(Object key) {
		if(properties!=null) {
		 value =	(String) properties.get(key);
		}
		else {
			System.out.println("value is null");
		}
		return value;
	}
	
	public String getvalue(String key, String defaultvalue) {
		if(properties!=null) {
		value = properties.getProperty(key);
		if(value==null) {
			value = defaultvalue;
		}
		}
		else {
			System.out.println("value is null");
		}
		return value;
	}
	
	public String getvalue(Object key, Object defaultvalue) {
		if(properties!=null) {
		value = (String) properties.get(key);
		if(value==null) {
			value = (String) defaultvalue;
		}
		}
		else {
			System.out.println("value is null");
		}
		return value;
	}
	
	public void writekeyvalue(String key, String value) throws IOException {
		if(properties!=null) {
			properties.setProperty(key, value);
			FileOutputStream Fop = new FileOutputStream(Filepath);
			properties.store(Fop, "saved successfully");
		}
		else {
			System.out.println("propertiesdata is null");
		}
	}
	public void writekeyvalue(Object key, Object value) throws IOException {
		if(properties!=null) {
			properties.put(key, value);
			FileOutputStream Fop = new FileOutputStream(Filepath);
			properties.store(Fop, "saved successfully");
		}
		else {
			System.out.println("propertiesdata is null");
		}
	}
	public void removevalue(Object key, Object value) throws IOException {
		if(properties!=null) {
			properties.remove(key, value);
			FileOutputStream Fop = new FileOutputStream(Filepath);
			properties.store(Fop, "saved successfully");
		} 
		else {
			System.out.println("propertiesdata is null");
		}
	}
}