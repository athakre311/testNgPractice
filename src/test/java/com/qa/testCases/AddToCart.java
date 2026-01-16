package com.qa.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddToCart {
	WebDriver driver = new ChromeDriver();
	
	@Test (priority=1, groups="smocke", retryAnalyzer = com.qa.base.RetryAnalyzer.class )
	@Parameters("p1")
	public void addToCart(String p1) {
	System.out.println("Hello 001  "+p1+ " >> "+Thread.currentThread().getId());
	driver.findElement(By.xpath("//a")).click();
//	throw new SkipException("Skip Exception");
	}
	
	@Test (priority=2, dependsOnMethods="addToCart", groups="smocke", retryAnalyzer = com.qa.base.RetryAnalyzer.class )
	@Parameters("p32")
	public void addToCart1(String p3) {
	System.out.println("Hello 002  "+p3+" >> "+Thread.currentThread().getId());
	}
	
	@Test (priority=3, groups="smocke", invocationCount = 3)
	@Parameters({"p1","p2"})
	public void addToCart2(@Optional("sorry")String n, @Optional("sorry")String p) {
	System.out.println("Hello 003" + n+" >>>> "+ p+" >> "+Thread.currentThread().getId());
	}
	
	@Test (priority=4)
	public void addToCart3() {
	System.out.println("Hello 004"+" >> "+Thread.currentThread().getId());
	}
	
	@Test (priority=5)
	public void addToCart4() {
	System.out.println("Hello 005"+" >> "+Thread.currentThread().getId());
	}
	
	@Test (priority=6)
	public void addToCart6() {
	System.out.println("Hello 006"+" >> "+Thread.currentThread().getId());
	}
	
	@Test (priority=7)
	public void addToCart7() {
	System.out.println("Hello 007"+" >> "+Thread.currentThread().getId());
	}
	
	@Test (priority=8)
	public void addToCart8() {
	System.out.println("Hello 004"+" >> "+Thread.currentThread().getId());
	}

}
