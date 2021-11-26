package com.rameshsoft.automation.businessreq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.Listener.Retryana;
import com.rameshsoft.automation.Utilities.POJOReader;
import com.rameshsoft.automation.base.Basetest;
import com.relevantcodes.extentreports.LogStatus;

public class Fbtest extends Basetest {
	
	@Test(retryAnalyzer = Retryana.class)
	public void fblogi() throws IOException {
		
	String url = 	POJOReader.getconfig().getvalue("facebook");
	getDriver().get(url);
	String Data = POJOReader.getconfig().getvalue("un_gmail");
	getExtenettest().log(LogStatus.PASS, "entered gmail");
	
	
	String un = POJOReader.getOR().getvalue("pass-id");
	getExtenettest().log(LogStatus.PASS, "password entered");
	
	getDriver().findElement(By.id(un)).sendKeys(Data);
		/*FileInputStream fip = new FileInputStream("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\configuration.properties");
		Properties prconf = new Properties();
		prconf.load(fip);
	String url = 	prconf.getProperty("facebook");
	String data = prconf.getProperty("un_gmail");
	
	getDriver().get(url);
	FileInputStream fip1 = new FileInputStream("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\src\\com\\rameshsoft\\automation\\Objectrep\\Or.properties");
	Properties pror = new Properties();
	pror.load(fip1);
	String un = pror.getProperty("id");
	
	
	getDriver().findElement(By.id(un)).sendKeys(data);;*/
		
		
		/*getDriver().get("https://www.facebook.com");
		getDriver().findElement(By.id("identifierId")).sendKeys("vinitha");*/
		
	}
}
