package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basic.sharedataSD.SharedClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDef {

	WebDriver driver;

	public DemoStepDef(SharedMulti share) {
	driver = share.setup();
	}
	
	@Given("^User needs to be on demo site page$")
	public void user_needs_to_be_on_demo_site_page_page() throws InterruptedException {
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
	}
	
	@When("User enters first name")
	public void user_enters_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Tom");
		Thread.sleep(2000);
	}
	
	@When("User enters last name")
	public void user_enters_last_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jerry");
		Thread.sleep(2000);
	}
	
}
