package com.basic.multiSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class SharedMulti {

	WebDriver driver;
	
	@Before
	public WebDriver setup(){
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobert\\Documents\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	@After
	public void tearDown() {
		driver.quit();
		driver = null;
	}
	
	
	
}
