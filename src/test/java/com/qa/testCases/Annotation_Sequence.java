package com.qa.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Sequence {
	
	@Test (priority=1)
	public void test001() {
		System.out.println(">>>>>Test<<<<<<");
	}
	@Test (priority=0) 
	public void test0012() {
		System.out.println(">>>>>@BeforeSuite<<<<<<");
	}
	@BeforeTest
	public void test0013() {
		System.out.println(">>>>>@BeforeTest<<<<<<");
	}
	@BeforeClass
	public void test0014() {
		System.out.println(">>>>>@BeforeClass<<<<<<");
	}@BeforeMethod
	public void test0015() {
		System.out.println(">>>>>@BeforeMethod<<<<<<");
	}
	@AfterSuite
	public void test0016() {
		System.out.println(">>>>>@AfterSuite<<<<<<");
	}
	@AfterTest
	public void test0017() {
		System.out.println(">>>>>@AfterTest<<<<<<");
	}
	@AfterClass
	public void test0018() {
		System.out.println(">>>>>@AfterClass<<<<<<");
	}@AfterMethod
	public void test0019() {
		System.out.println(">>>>>@AfterMethod<<<<<<");
	}

}
