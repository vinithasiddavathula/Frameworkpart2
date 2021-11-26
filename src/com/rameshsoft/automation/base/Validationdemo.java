package com.rameshsoft.automation.base;

import org.testng.asserts.SoftAssert;

public class Validationdemo {
	public static void main(String[] args) {
		int num = 56,num2 = 57;
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(num, num2);
		
		System.out.println("Git tets");
		
	}

}
