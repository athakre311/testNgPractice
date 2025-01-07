package com.qa.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class RegisterTest extends Base {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = InisalizeBrowser();

	}

//	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1)
	public void registerWithCredentials() {

		Boolean bl = driver.findElement(By.xpath("//a[text()=' Home']")).isDisplayed();
		Assert.assertTrue(bl);
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		String msg = driver.findElement(By.xpath("(//h2)[3]")).getText();
		Assert.assertEquals("New User Signup!", msg);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("test@test22");
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();

		String msg11 = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']")).getText();
		Assert.assertEquals("ENTER ACCOUNT INFORMATION", msg11);

//		Step 09
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("name")).sendKeys("test");
//		driver.findElement(By.id("email")).sendKeys("test@test");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("days")).click();
		driver.findElement(By.xpath("//select[@id='days']//option[@value='1']")).click();

		driver.findElement(By.id("months")).click();
		driver.findElement(By.xpath("//select[@id='months']//option[@value='1']")).click();

		driver.findElement(By.id("years")).sendKeys("test");
		driver.findElement(By.xpath("//option[text()='2021']")).click();


//		Step 10
		driver.findElement(By.id("newsletter")).click();
		
//		Step 11
		driver.findElement(By.id("optin")).click();	
		
//		Step 12
		driver.findElement(By.id("first_name")).sendKeys("test");	
		driver.findElement(By.id("last_name")).sendKeys("test");	
		driver.findElement(By.id("company")).sendKeys("test");	
		driver.findElement(By.id("address1")).sendKeys("test");	
		driver.findElement(By.id("address2")).sendKeys("test");	
		driver.findElement(By.id("country")).sendKeys("test");
		
		driver.findElement(By.xpath("//option[@value='India']")).click();
		

		driver.findElement(By.id("state")).sendKeys("test");	
		driver.findElement(By.id("city")).sendKeys("test");	
		driver.findElement(By.id("zipcode")).sendKeys("test");	
		driver.findElement(By.id("city")).sendKeys("test");	
		driver.findElement(By.id("mobile_number")).sendKeys("test");	
		driver.findElement(By.id("city")).sendKeys("test");	
		
//		Step 13
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
//		Step 14
		String mag1 = driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
		Assert.assertEquals("ACCOUNT CREATED!", mag1);
		
//		Step 15
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		driver.findElement(By.id("dismiss-button")).click();
		
//		Step 16
		String mag2 = driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
		System.out.println(mag2);
		Assert.assertEquals("Logged in as testtest", mag2);

//		Step 17
		driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
		
//		Step 18
		String mag3 = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
		System.out.println(mag3);
		Assert.assertEquals("ACCOUNT DELETED!", mag3);
		
		 
		System.out.println("Hello Abby");

	}
	

}
