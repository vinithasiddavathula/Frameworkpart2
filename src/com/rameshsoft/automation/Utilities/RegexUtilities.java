package com.rameshsoft.automation.Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegexUtilities {
	
	public static boolean isvalid(String Phnum) {
		boolean value = true;
		Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher matcher = pattern.matcher(Phnum);
		
		if(matcher.find()&&matcher.group().equalsIgnoreCase(Phnum)) {
			System.out.println("phonenum is valid");
		}
		else {
			System.out.println("phonenum is not valid");
			value = false;
		}
		return value;
	}

	public static boolean  ismailvalid(String email) {
		
		boolean value = true;
		Pattern pattern =	Pattern.compile("[a-zA-Z0-9^a-zA-Z0-9]");
	//Pattern pattern = 	Pattern.compile("^(.+)@(\\S+)$");
	Matcher matcher = pattern.matcher(email);
	
	if(matcher.find()&&matcher.group().equalsIgnoreCase(email)) {
		System.out.println("email address is valid ");
	}
	
	else {
		System.out.println("email address is invalid ");
		value = false;
	}
	return value;
		
	}
}
