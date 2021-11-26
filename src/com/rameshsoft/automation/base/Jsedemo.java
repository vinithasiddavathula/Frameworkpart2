package com.rameshsoft.automation.base;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Jsedemo extends Basetest {
	
	@Test
	public void demo() {
		
		getDriver().get("https://www.gmail.com");
		
		WebElement username = getDriver().findElement(By.id("identifierId"));
		
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		
		jse.executeScript("arguments[0].value='vinitha';", username);
		
		WebElement next = 	getDriver().findElement(By.id("identifierNext"));
		
		jse.executeScript("arguments[0].click();", next);
		
	}
	
}
