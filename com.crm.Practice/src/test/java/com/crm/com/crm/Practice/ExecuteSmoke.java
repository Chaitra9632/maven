package com.crm.com.crm.Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecuteSmoke {
	
	@Test
	public void runMe()
	{
		System.out.println("hey im here in smoke!!!!");
		Reporter.log("hi im smoke");
	}
	

}
