package com.rameshsoft.automation.Listener;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.rameshsoft.automation.Utilities.Screenshotutilities;

public class Tctracking extends TestListenerAdapter {
	
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Testcase is failed" +arg0.getName());
		try {
			Screenshotutilities.takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Testcase is skipped" +arg0.getName());
		try {
			Screenshotutilities.takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("testcase passed" +arg0.getName());
	}


}
