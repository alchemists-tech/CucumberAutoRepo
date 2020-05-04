package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basic.sharedataSD.SharedClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDef {

	WebDriver driver;

	public GoogleStepDef(SharedMulti share) {
	driver = share.setup();
	}
	
	@Given("^User needs to be on google page$")
	public void user_needs_to_be_on_google_page() {
		driver.get("https://www.google.com/");
	}
	
	@When("User enters search string")
	public void user_enters_search_string() {
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("selenium");
	}
}
