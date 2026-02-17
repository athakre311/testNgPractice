package com.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	WebDriver driver;
//	ChromeOptions options;

	public WebDriver InisalizeBrowser(String browser) {
//		options = new ChromeOptions();
//      options.addArguments("--headless"); // Run in headless mode
//      options.addArguments("--window-size=1920,1080"); // Optional for full page rendering
//		driver = new ChromeDriver(options);
		if(browser.equalsIgnoreCase("chrome")) {
			driver =new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver =new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/");
		return driver;
	}

}
