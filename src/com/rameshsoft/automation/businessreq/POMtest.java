package com.rameshsoft.automation.businessreq;

import java.io.IOException;

import org.junit.Test;

import com.rameshsoft.automation.PMO.Gmail_homepage;
import com.rameshsoft.automation.Utilities.POJOReader;
import com.rameshsoft.automation.base.Actionengine;

public class POMtest extends Actionengine {
	
	@org.testng.annotations.Test
	public static void demo() throws IOException, InterruptedException {
		
		String url = POJOReader.getconfig().getvalue("gmail");
		enterurl(url);
		Thread.sleep(2000);
		Gmail_homepage.usernamedata(POJOReader.getexcel().getsinglecelldata("index", "0",0 , 0));
		Gmail_homepage.click();
		
		
			
	}

}
