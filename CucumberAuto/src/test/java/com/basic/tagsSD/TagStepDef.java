package com.basic.tagsSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagStepDef {
	
	
	WebDriver driver;
	
	@Given("^User needs to be on Facebook Login Page$")
	public void user_needs_to_be_on_Facebook_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobert\\Documents\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys(userName);
		Thread.sleep(1000);
	}
	
	@Then("^User checks if \"([^\"]*)\" first name is present$")
	public void user_checks_if_first_name_is_present(String userName) throws InterruptedException {
		String userNameActual =driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
		
	}
	
	@And("User enters user \"([^\"]*)\" surname")
	public void user_enters_user_surname(String surName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys(surName);
		Thread.sleep(1000);
	}
	
	@Then("User Mobile field should be blank")
	public void user_mobile_field_should_be_blank() throws InterruptedException {
		String mobileActual =driver.findElement(By.xpath("//input[@id='u_0_r']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	@Then("close browser")
	public void close_browser() {
		driver.quit();
		driver = null;
	}
	
}
