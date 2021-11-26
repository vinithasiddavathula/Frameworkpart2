package com.rameshsoft.automation.Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		/*Pattern pattern = 	Pattern.compile("a");
		Matcher matcher = pattern.matcher("at java Lang reflect");*/
		
		/*Pattern pattern =	Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher("123vinitha678");
		
		int sum = 0;
		while(matcher.find()) {
			String group = matcher.group();
		int value  =	Integer.parseInt(group);
		sum = sum+value;
		}*/
	//	System.out.println(sum);
		/*int count = 0;
		while(matcher.find()) {
		String group =	matcher.group();
		count++;
		int startindex = matcher.start();
		int endindex = matcher.end();
		System.out.println(group+"   " +startindex+ "   " +endindex);
		System.out.println(count);
		}*/
	
		RegexUtilities.ismailvalid("vinitha.0503@gmail.com");
	}
	
}
