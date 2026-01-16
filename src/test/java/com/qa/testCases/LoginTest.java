package com.qa.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class LoginTest extends Base {

	WebDriver driver;

	@BeforeMethod
//	@Parameters ("browser")
	public void setup(String b) {
		driver = InisalizeBrowser(b);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1, invocationCount = 1)
	@Parameters({"uName","pass"})
	public void loginWithValidCredentials(@Optional("hello") String name, @Optional("hello")String pass) {
		System.out.println(">>>>>> LoginTest 001 <<<<<<<"+name+">>>>>>"+pass);
		System.out.println("get Thread ID"+Thread.currentThread().getId());
	}

	@Test(priority = 2)
	public void loginWithInvalidCredentials() {
		System.out.println(">>>>>> LoginTest 002 <<<<<<<");
		System.out.println("get Thread ID"+Thread.currentThread().getId());
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

	}

	@Test(priority = 3)
	public void loginWithNoCredentials() {
		System.out.println(">>>>>> LoginTest 003 <<<<<<<");
		System.out.println("get Thread ID"+Thread.currentThread().getId());

	}
}
