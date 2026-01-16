package com.qa.testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Priority {
	
	@Test (priority=0, invocationCount=3, enabled=false)
	public void test001() {
		System.out.println("hello  Test 001");
	}
	
	@Test 
	@Parameters({"uname","pass"})
	public void test002(String str, String str1) {
		System.out.println("hello  Test 002"+str+"  >>  "+str1);

	}
	
	@Test (priority=-1)
	public void test003() {
		System.out.println("hello  Test 00");

	}

}
