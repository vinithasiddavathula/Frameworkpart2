package com.rameshsoft.automation.Utilities;

import java.time.LocalDate;
import java.time.LocalTime;

public interface DateTimeUtilities {
	
	public static String getcurrentymd(){
		LocalDate localdate = LocalDate.now();
		String localdatestring = localdate.toString();
		return localdatestring;
	}
	
	public static String getcurrenttime() {
	LocalTime localtime =	LocalTime.now();
	 String localStringtime = localtime.toString();
	 return localStringtime;
		
	}
	
	public static String getcurrentdate(){	
		String ymd = getcurrentymd();
		String[] ymd2 =  ymd.split("-");
		String date = ymd2[2];
		return date;
	}
	
	public static String getCurrentmonth() {
		String ymd = getcurrentymd();
		String[] ymd2 =  ymd.split("-");
		String Month = ymd2[1];
		return Month;
	}
	public static String getCurrentYear() {
		String ymd = getcurrentymd();
		String[] ymd2 =  ymd.split("-");
		String year = ymd2[0];
		return year;
	}
	 
	public static String getfuturedate(int daysToAdd) {
		LocalDate localdate = LocalDate.now();
		LocalDate localdat = localdate.plusDays(daysToAdd);
		String futuredate = localdat.toString();
		return futuredate;
	}
	public static String getpastdate(int daysToAdd) {
		LocalDate localdate = LocalDate.now();
		LocalDate localdat = localdate.minusDays(daysToAdd);
		String pastdate = localdat.toString();
		return pastdate;
	}
	
	public static void main(String[] args) {
		System.out.println(getcurrenttime());
		String[] time = getcurrenttime().split(":");
		String value = time[0].toString();
		System.out.println(value);
		
	}
}
