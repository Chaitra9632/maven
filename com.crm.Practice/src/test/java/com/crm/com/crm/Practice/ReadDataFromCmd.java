package com.crm.com.crm.Practice;

import org.testng.annotations.Test;

public class ReadDataFromCmd {
	
	@Test
	public void readData()
	{
		System.out.println("reading the data");
		String URL = System.getProperty("URL");
		String BROWSER = System.getProperty("BROWSER");
		System.out.println(URL);
		System.out.println(BROWSER);
	}

}
