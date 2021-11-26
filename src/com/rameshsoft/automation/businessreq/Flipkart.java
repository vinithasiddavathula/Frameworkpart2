package com.rameshsoft.automation.businessreq;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.rameshsoft.automation.base.Basetest;

public class Flipkart extends Basetest {
	
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\vinitha\\eclipse-workspace\\Frameworkpart2\\Drivers");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("vinitha.0503@gmail.com");;
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Vinitha@234");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		/*driver.get("https://www.flipkart.com");
		//getDriver().get("https://www.flipkart.com");
		//WebElement login = getDriver().findElement(By.xpath("//a[text()='Login']"));
		//login.click();
		//Alert alert = driver.switchTo().alert();
		WebElement send = driver.findElement(By.xpath("//input[@type='text']"));
		send.sendKeys("vinitha");
		Alert alert = getDriver().switchTo().alert();
		alert.dismiss();*/
		driver.close();
	}
}
