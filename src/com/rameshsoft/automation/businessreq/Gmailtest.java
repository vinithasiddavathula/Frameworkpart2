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

public class Gmailtest extends Basetest{
	
		@Test(retryAnalyzer=Retryana.class)
		public void	login() throws IOException{
		/*	FileInputStream fip = new FileInputStream("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\configuration.properties");
			Properties prconf = new Properties();
			prconf.load(fip);*/
			String url = POJOReader.getconfig().getvalue("gmail");
			getDriver().get(url);
			getExtenettest().log(LogStatus.PASS, "URLentered");
		String data = POJOReader.getconfig().getvalue("un_gmail");
			/*
			FileInputStream fip1 = new FileInputStream("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\src\\com\\rameshsoft\\automation\\Objectrep\\Or.properties");
			Properties pror = new Properties();
			pror.load(fip1);*/
		String un =	POJOReader.getOR().getvalue("gmail_id");
		
		getDriver().findElement(By.id(un)).sendKeys(data);;
		getExtenettest().log(LogStatus.PASS, "sent data");
			
		POJOReader.getexcel().getsinglecelldata("index", "0", 0, 0)	;
		
			/*getDriver().get("https://www.gmail.com");
			getDriver().findElement(By.id("identifierId")).sendKeys("vinitha");*/
			
			
}

}
