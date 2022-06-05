package com.selenium.app;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTools {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
	}
	
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}		
	}
	
}
