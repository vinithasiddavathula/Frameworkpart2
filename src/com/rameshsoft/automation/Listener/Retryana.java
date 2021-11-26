package com.rameshsoft.automation.Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryana implements IRetryAnalyzer {

	int count = 0;
	int retrycount = 4;
	@Override
	public boolean retry(ITestResult arg0) {
		if(ITestResult.FAILURE==arg0.getStatus()&&count<=retrycount) {
			try {
				Thread.sleep(3000);
				System.out.println("count is :" +count+ "executing" +arg0.getName());
				count++;
				return true;
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
