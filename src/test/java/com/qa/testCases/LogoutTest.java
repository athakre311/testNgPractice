package com.qa.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class LogoutTest extends Base {

	WebDriver driver;

	@BeforeMethod
//	@Parameters ("browser")
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1)
	@Parameters({"uname", "pass"})
	public void logoutTest01(@Optional("hello")String str1, @Optional("hello")String str2) {
		System.out.println(">>>>> LogoutTest User Name = "+str1+" Password "+str2);

	}

	@Test(priority = 2)
	public void logoutTest02() {
		System.out.println(">>>>> LogoutTest 002 <<<<<<");
		driver.findElement(By.xpath("//a[@href='/login11']")).click();
//		System.out.println(">>>>> LogoutTest 002 <<<<<<" + Thread.currentThread().getId());
	}

	@Test(priority = 3)
	public void logoutTest03() {
		System.out.println(">>>>> LogoutTest 002 <<<<<<");
		driver.findElement(By.xpath("//a[@href='/login11']")).click();

		System.out.println(">>>>> LogoutTest 003 <<<<<<" + Thread.currentThread().getId());
	}

	@Test(priority = 4)
	public void logoutTest011() {
		System.out.println(">>>>> LogoutTest 002 <<<<<<");
//		System.out.println(">>>>> LogoutTest 004 <<<<<<" + Thread.currentThread().getId());
	}

	@Test(priority = 5)
	public void logoutTest021() {
		System.out.println(">>>>> LogoutTest 002 <<<<<<");
//		System.out.println(">>>>> LogoutTest 005 <<<<<<" + Thread.currentThread().getId());
	}

	@Test(priority=6)
	public void logoutTest031() {
		System.out.println(">>>>> LogoutTest 002 <<<<<<");
//		System.out.println(">>>>> LogoutTest 006 <<<<<<" + Thread.currentThread().getId());
	}
}
