package com.rameshsoft.automation.Objectrep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertydemo {
	public static void main(String[] args) throws IOException {
	FileInputStream fip = new FileInputStream("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\src\\com\\rameshsoft\\automation\\Objectrep\\Or.properties");
	Properties  pr = new Properties();
	pr.load(fip);
	System.out.println(pr.getProperty("id"));;
	
	System.out.println(pr.setProperty("key", "you"));
	
	FileOutputStream fop = new FileOutputStream("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\src\\com\\rameshsoft\\automation\\Objectrep\\Or.properties");
	pr.store(fop, "successful");
	}

}
