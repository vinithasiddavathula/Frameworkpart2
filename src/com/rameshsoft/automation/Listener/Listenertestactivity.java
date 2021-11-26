package com.rameshsoft.automation.Listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.automation.Utilities.Screenshotutilities;

public class Listenertestactivity implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Suite execution is finished");
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("suite execution is started");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

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
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("testcase passed" +arg0.getName());
	}

}
