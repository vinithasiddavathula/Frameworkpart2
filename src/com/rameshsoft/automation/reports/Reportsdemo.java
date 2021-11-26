package com.rameshsoft.automation.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reportsdemo {
	public static void main(String[] args) {
	
		ExtentReports extendrp = new ExtentReports("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\reports\\reports.html");
		ExtentTest exttest = extendrp.startTest("demo");
			exttest.log(LogStatus.PASS, "brower opened");
			exttest.log(LogStatus.PASS, "username entered");
			exttest.log(LogStatus.PASS, "clicked on next");
			exttest.log(LogStatus.PASS, "password entered");
			exttest.log(LogStatus.PASS, "brower opened");
			extendrp.endTest(exttest);
			extendrp.flush();
			extendrp.close();
		
	}
	

}
