package com.qa.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptExecutor001 {

	WebDriver driver;
	JavascriptExecutor js;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		js = (JavascriptExecutor)driver;
	}

	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void click001() {
		WebElement ele = driver.findElement(By.id("sunday"));
		js.executeScript("arguments[0].click();", ele);
	}
	
	@Test
	public void HoverElement() {
		WebElement ele = driver.findElement(By.id("sunday"));
		js.executeScript("arguments[0].click();", ele);
	}
	
	@Test
	public void TexttoInputField() {
		WebElement ele = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].value='test';", ele);
	}
	
	@Test
	public void ScrollDownthePage() {
		WebElement ele = driver.findElement(By.id("sunday"));
		js.executeScript("window.scrollBy(0,500);");
	}
	
	@Test
	public void ScrollDowntheEle() {
		WebElement ele = driver.findElement(By.id("sunday"));
		js.executeScript("arguments[0].scrollIntoView(true)';", ele);
	}
	
	@Test
	public void GetPageTitle_URl() {
		System.out.println(js.executeScript("return document.title;"));
		System.out.println(js.executeScript("return document.URL;"));
	}
}
