package com.qa.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class LogoutTest extends Base {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = InisalizeBrowser();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1)
	public void logoutTest01() {
		System.out.println(">>>>> LogoutTest 001 <<<<<<");
	}

	@Test(priority = 2)
	public void logoutTest02() {
		System.out.println(">>>>> LogoutTest 002 <<<<<<");
	}

	@Test(priority = 3)
	public void logoutTest03() {
		System.out.println(">>>>> LogoutTest 003 <<<<<<");
	}
}
