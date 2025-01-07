package com.qa.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.qa.base.Base;

@Ignore
public class LoginTest extends Base{
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = InisalizeBrowser();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@Test (priority=1, enabled = false)
	public void loginWithValidCredentials() {
		 System.out.println(">>>>>> LoginTest 001 <<<<<<<");
	}
	
	@Test (priority=2) 
	public void loginWithInvalidCredentials() {
		 System.out.println(">>>>>> LoginTest 002 <<<<<<<");

	}


	@Test (priority=3)
	public void loginWithNoCredentials() {
		 System.out.println(">>>>>> LoginTest 003 <<<<<<<");

	}
}
