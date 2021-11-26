package com.rameshsoft.automation.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rameshsoft.automation.base.Basetest;

public interface Screenshotutilities {
	
	public static  String  takescreenshot() throws IOException {
		TakesScreenshot takescreenshot = (TakesScreenshot) Basetest.getDriver();
		File file = takescreenshot.getScreenshotAs(OutputType.FILE);
		String Imagepath = System.getProperty("user.dir")+"\\screenshots\\"+Basetest.getTcname()+".jpeg";
		FileUtils.copyFile(file, new File(Imagepath));
		return Imagepath;
	}
	public static  String  takescreenshot(String tcname) throws IOException {
		TakesScreenshot takescreenshot = (TakesScreenshot) Basetest.getDriver();
		File file = takescreenshot.getScreenshotAs(OutputType.FILE);
		String Imagepath = System.getProperty("user.dir")+"\\screenshots\\"+tcname+".jpeg";
		FileUtils.copyFile(file, new File(Imagepath));
		return Imagepath;
	}

}
