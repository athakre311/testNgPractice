package com.qa.testCases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgAll {
	
	@Test(priority = 0)
	@Parameters({"uname","pass"})
	public void annotation01(@Optional("uTest")String uname, @Optional("12345")int pass) {
		System.out.println("class 01 >> priority 0"+uname+ " > > "+pass);
	}
	
	@Test (priority = 0, invocationCount = 10, enabled = true)
	public void annotation02() {
		System.out.println("class 01 >> @priority 3");
	}
	
	@Test (priority = 0)
	public void annotation03() {
		System.out.println("class 01 >> @priority -1");
	}
	
//	@BeforeMethod
	public void annotation04() {
		System.out.println("class 01 >> @BeforeMethod");
	}
	
	@Test (priority =0,groups="smoke")
	public void annotation05() {
		System.out.println("class 01 >>@priority 1");
	}
	
	
	@Test(groups="smoke")
	public void annotation07() {
		System.out.println("class 01 >> No priority");
	}
	
	@Test
	public void annotation08() {
		System.out.println("class 01 >> @AfterClass");
	}
	
	@Test
	public void annotation09() {
		System.out.println("class 01 >> @AfterTest");
	}
	
	@Test(groups="smoke")
	public void annotation10() {
		System.out.println(" class 2 @AfterSuite");
	}

}
