package com.rameshsoft.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.rameshsoft.automation.Exceptions.FrameworkExceptions;
import com.rameshsoft.automation.Utilities.Driverpath;
import com.rameshsoft.automation.Utilities.Screenshotutilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Basetest {
	
	private static WebDriver driver;
	private static String Tcname;
	private ExtentReports extentreports;
	private static ExtentTest extenettest;
	
	@Parameters({"browser"})
	@BeforeSuite
	public void openbrowser(@Optional("chrome")String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(Driverpath.chromekey, Driverpath.chromevalue);
			driver = new ChromeDriver();
			init();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("Webdriver.firefox.driver", "");
			 driver  = new FirefoxDriver();
			 init();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("Webdriver.ie.driver", "");
			 driver  = new InternetExplorerDriver();
			 init();
		}
		}
	
	private void init() {
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closebrowser(){
		if(driver!=null) {
			driver.close();
		}
	}
	@AfterMethod
	public void methodresult(ITestResult result) throws IOException {
		 Tcname = result.getName();
		if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("tcname is " +Tcname);
			extenettest.log(LogStatus.PASS, "test case passed"+Tcname);
			
		}
		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("tcname is failed " +Tcname);
			String imagepath = Screenshotutilities.takescreenshot(Tcname);
			extenettest.log(LogStatus.FAIL, "test case failed"+Tcname);
			extenettest.addScreenCapture(imagepath);
			
			
		}
		if(result.getStatus()==ITestResult.SKIP) {
			System.out.println("tcname is " +Tcname);
			extenettest.log(LogStatus.SKIP, "test case skipped"+Tcname);
		}
		extentreports.endTest(extenettest);
		extentreports.flush();
	}
	@BeforeMethod
	public void methodName(Method method) {
	 Tcname	= method.getName();
	//System.out.println(Tcname);
	  extenettest = extentreports.startTest(Tcname);
	  extenettest.log(LogStatus.PASS, "current test case is" +Tcname);
	}
	@BeforeTest
	public void initreport() {
		 extentreports = new ExtentReports("C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\reports\\reports.html");
	}
	@AfterTest
	public void generatereports() throws FrameworkExceptions {
		if(extentreports!=null) {
			extentreports.close();
		}
		else
		{
			System.out.println("extentreports are pointing to null");
			FrameworkExceptions exception = new FrameworkExceptions("extentreports are pointing to null");
			throw exception;
		}
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static String getTcname() {
		return Tcname;
	}
	public static ExtentTest getExtenettest() {
		return extenettest;
	}
	}
