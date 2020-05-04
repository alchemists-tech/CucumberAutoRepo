package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	
	WebDriver driver;
	
	@Given("^User needs to be on Facebook Login Page$")
	public void user_needs_to_be_on_Facebook_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobert\\Documents\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Opening URL");
	}

	@When("^User enters user first name$")
	public void user_enters_user_first_name() {
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("David");
		
	}
	
	@Then("^User checks if first name is present$")
	public void user_checks_if_first_name_is_present() {
		String userNameActual =driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);
		
	}
	@Then("close browser")
	public void close_browser() {
		driver.quit();
		driver = null;
	}
	
}
