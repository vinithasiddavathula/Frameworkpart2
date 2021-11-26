package com.rameshsoft.automation.base;

import static org.testng.Assert.assertTrue;

import java.awt.dnd.DropTargetContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class Actionengine extends Basetest {
	
	public static void enterurl(String Url) {
		try
		{
			getDriver().get(Url);
			getExtenettest().log(LogStatus.PASS, "URL entered" +Url);
		}
		catch(Exception e){
			getExtenettest().log(LogStatus.FAIL, "URL entered wrongly" +Url);
		}
	}
	public static void navigateto(String Url) {
		try {
			getDriver().navigate().to(Url);
			getExtenettest().log(LogStatus.PASS, "URL entered" +Url);
		}
		catch(Exception e){
			getExtenettest().log(LogStatus.FAIL, "URL entered wrongly" +Url);
		}
	}
	public static void click(WebElement element) {
		try {
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			element.click();
			getExtenettest().log(LogStatus.PASS, "element id displayed");
		}
		catch(Exception ee) {
			getExtenettest().log(LogStatus.FAIL, "element is not displayed");
		}
	}
	public static void actionsclick(WebElement element) {
		try {
			Actions action = new Actions(getDriver());
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			action.click(element).build().perform();;
			getExtenettest().log(LogStatus.PASS, "element id displayed");
		}
		catch(Exception e) {
			getExtenettest().log(LogStatus.FAIL, "element is not displayed");
		}
	}
	public static void actionsdoubleclick(WebElement element) {
		try {
			Actions action = new Actions(getDriver());
			Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
			action.doubleClick(element).build().perform();;
			getExtenettest().log(LogStatus.PASS, "element id displayed");
		}
		catch(Exception e) {
			getExtenettest().log(LogStatus.FAIL, "element is not displayed");
		}
	}
		public static void DTA(WebElement element,String data){
			try {
				Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
				getExtenettest().log(LogStatus.PASS, "element id displayed");
				element.sendKeys(data);
				getExtenettest().log(LogStatus.PASS, "data has been sent");
			}
			catch(Exception e) {
				getExtenettest().log(LogStatus.FAIL, "element is not displayed");
			}
		}
			public static void byActionsDTA(WebElement element,String data){
				try {
					Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
					getExtenettest().log(LogStatus.PASS, "element id displayed");
					Actions action = new Actions(getDriver());
					action.click(element).sendKeys(data).build().perform();
					//element.sendKeys(data);
					getExtenettest().log(LogStatus.PASS, "data has been sent");
				}
				catch(Exception e) {
					getExtenettest().log(LogStatus.FAIL, "element is not displayed");
				}
			}
				public static void dropdown(WebElement element, String how,String value) {
					try {
						Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
						getExtenettest().log(LogStatus.PASS, "element id displayed");
						Select select = new Select(element);
						if(how.equalsIgnoreCase("value")){
							select.selectByValue(value);
						}
						else if(how.equalsIgnoreCase("text")) {
							select.selectByVisibleText(value);
						}
						else if(how.equalsIgnoreCase("index")) {
						int value2 = 	Integer.parseInt(value);
						select.selectByIndex(value2);
						}
					}
					catch(Exception e) {
						getExtenettest().log(LogStatus.FAIL, "element is not displayed");
					}	
				}
				public static void Multiwindows() {
					try {
						String currentwindow = getDriver().getWindowHandle();
						Set<String> windows = getDriver().getWindowHandles();
						for(String str: windows) {
							if(!str.equalsIgnoreCase(currentwindow)) {
								getDriver().switchTo().window(str);
								getExtenettest().log(LogStatus.PASS, "Window switched to" +currentwindow);
							}
						}
					}
					catch(Exception e) {
						getExtenettest().log(LogStatus.FAIL, "not able to switch to  Window" );
					}
				}
				public static void Multiwindows(int index) {
					try {
						Set<String> windows = getDriver().getWindowHandles();
						List<String> windowindex = new ArrayList<String>(windows);
					String windowname = 	windowindex.get(index);
					getDriver().switchTo().window(windowname);
						
								getExtenettest().log(LogStatus.PASS, "Window switched to" +windowname);
							}
					catch(Exception e) {
						getExtenettest().log(LogStatus.FAIL, "not able to switch to  Window" );
					}
				}
				public void closecurrentwindow() {
					try {
						getDriver().close();
						getExtenettest().log(LogStatus.PASS, "window closed");
					}
					catch(Exception e)
					{
						getExtenettest().log(LogStatus.FAIL, "unable to close  Window" );	
					}
				}
				public void closeallwindows() {
					try {
						getDriver().quit();
						getExtenettest().log(LogStatus.PASS, "window closed");
					}
					catch(Exception e)
					{
						getExtenettest().log(LogStatus.FAIL, "unable to close  Window" );
					}
				}
			public void	mouseover(WebElement element) {
				try {
					Actions action = new Actions(getDriver());
					action.moveToElement(element).build().perform();
					getExtenettest().log(LogStatus.PASS, "mouse moved to" +element);
				}
				catch(Exception e){
					getExtenettest().log(LogStatus.PASS, "mouse unable to move");
				}
			}

}