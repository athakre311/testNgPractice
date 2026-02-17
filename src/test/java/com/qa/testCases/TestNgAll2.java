package com.qa.testCases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgAll2 {
	
	@Test(priority = 0, groups="smoke")
	@Parameters({"uname","pass"})
	public void annotation01(@Optional("uTest")String uname, @Optional("12345")int pass) {
		System.out.println("class 02 >> priority 0"+uname+ " > > "+pass);
	}
	
	@Test (priority = 0, invocationCount = 10, enabled = true)
	public void annotation02() {
		System.out.println("class 2 >> @priority 3");
	}
	
	@Test (dependsOnMethods="annotation04", groups="smoke")
	public void annotation03() {
		System.out.println("class 2 >> @priority -1");
	}
	
	@Test(enabled=true, groups="smoke")
	public void annotation04() {
		System.out.println("class 2 >> @BeforeMethod");
//		throw new Exception("skip");
	}
	
	@Test (priority = 0, groups={"smoke","sanity"})
	public void annotation05() {
		System.out.println("class 2 >>@priority 1");
	}
	
	
	@Test(groups={"sanity"})
	public void annotation07() {
		System.out.println("class 2 >> No priority");
	}
	
	@Test (groups={"sanity"})
	public void annotation08() {
		System.out.println("class 2 >> @AfterClass");
	}
	
	@Test (groups={"sanity"})
	public void annotation09() {
		System.out.println("class 2 >> @AfterTest");
	}
	
	@Test (groups={"sanity"})
	public void annotation10() {
		System.out.println("class 2 @AfterSuite");
	}

}
