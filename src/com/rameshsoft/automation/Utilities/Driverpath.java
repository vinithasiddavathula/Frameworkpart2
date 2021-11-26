package com.rameshsoft.automation.Utilities;

import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public interface Driverpath {
	String chromekey = "Webdriver.chrome.driver";
	String chromevalue = "C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\Drivers\\chromedriver.exe";
	
}




class Demo implements ITestResult{

	@Override
	public Object getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttribute(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(ITestResult arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getEndMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInstanceName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITestNGMethod getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getStartMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IClass getTestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITestContext getTestContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTestName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Throwable getThrowable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setEndMillis(long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setParameters(Object[] arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatus(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setThrowable(Throwable arg0) {
		// TODO Auto-generated method stub
		
	}
	
}