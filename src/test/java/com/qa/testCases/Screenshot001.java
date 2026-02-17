package com.qa.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Screenshot001 {

	@BeforeSuite
	public  void abby6() {
		System.out.println(" >>>>> @BeforeSuite ");
	}
	
	@AfterSuite
	public  void abby7() {
		System.out.println(" >>>>> @AfterSuite");
	}
	
	@BeforeTest
	public  void abby8() {
		System.out.println(" >>>>> @BeforeTest");
	}
	
	@AfterTest
	public  void abby9() {
		System.out.println(" >>>>> @AfterTest");
	}
	
	@BeforeClass
	public  void abby1() {
		System.out.println(" >>>>> @BeforeClass");
	}
	
	@AfterClass
	public  void abby2() {
		System.out.println(" >>>>> @AfterClass");
	}
	
	@BeforeMethod
	public  void abby3() {
		System.out.println(" >>>>> @BeforeMethod");
	}
	
	@AfterMethod
	public  void abby4() {
		System.out.println(" >>>>> @AfterMethod");
	}
	
	@Test
	public  void abby5() {
		System.out.println(" >>>>> ");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		WebElement ele = driver.findElement(By.id("gw-card-layout"));
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File ss = ele.getScreenshotAs(OutputType.FILE);
//		File f = new File(".//ss//abby001.png");
//		Files.copy(f,ss);

	}

}
