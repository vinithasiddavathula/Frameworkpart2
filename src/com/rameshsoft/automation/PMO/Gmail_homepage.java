package com.rameshsoft.automation.PMO;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.Basetest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_homepage extends Basetest
{
	@FindBy(id = "identifierId")
	private static WebElement username;
	
	@FindBy(xpath =  "//span[text()='Next']")
	private static WebElement next;
	
	@FindBy(xpath = "//button[text()='Forgot email?']")
	private static WebElement forgotemail;
	
	@FindBy(xpath = "//span[text()='Create account']")
	private static WebElement createaccount;
	
	public static void usernamedata(String data) {
		try {
			Assert.assertTrue(username.isDisplayed()&&username.isEnabled());
			getExtenettest().log(LogStatus.PASS, "username is displayed");
			username.sendKeys(data);
		}
		catch (Exception e) {
			getExtenettest().log(LogStatus.FAIL, "username is not displayed");
		}
	}
	
	public static void click() {
		try {
			Assert.assertTrue(next.isDisplayed()&&next.isEnabled());
			getExtenettest().log(LogStatus.PASS, "next is displayed");
			next.click();
			getExtenettest().log(LogStatus.PASS, "next is clicked");
		}
		catch (Exception e) {
			getExtenettest().log(LogStatus.FAIL, "next is not displayed");
		}
	}
	
	static {
		PageFactory.initElements(getDriver(), Gmail_homepage.class);
	}
	
}
