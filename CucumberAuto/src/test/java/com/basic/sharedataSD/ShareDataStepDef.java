package com.basic.sharedataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
	
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share) {
		driver = share.setup();
	}
	
	@Given("^User needs to be on Facebook Login Page$")
	public void user_needs_to_be_on_Facebook_Login_Page() {
		driver.get("https://www.facebook.com/");
	}

	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys(userName);
		Thread.sleep(1000);
	}

	
}
