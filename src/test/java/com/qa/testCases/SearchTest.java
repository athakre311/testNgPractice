package com.qa.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class SearchTest extends Base{
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = InisalizeBrowser();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@Test (priority=1)
	public void searchProduct01() {
		
		
		 System.out.println(">>>>> SearchTest 001 <<<<<<");
	}
	
	@Test (priority=2)
	public void searchProduct02() {
		if(true) {
		throw new SkipException(">>>>>>>>> Skip");
		}
		System.out.println(">>>>> SearchTest 002 <<<<<<");
	}


	@Test (priority=3)
	public void searchProduct03() {
		
		
		 System.out.println(">>>>> SearchTest 003 <<<<<<");
	}

}
