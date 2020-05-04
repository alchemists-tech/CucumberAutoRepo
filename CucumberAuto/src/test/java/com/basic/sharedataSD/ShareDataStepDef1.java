package com.basic.sharedataSD;

import org.junit.Assert;
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

public class ShareDataStepDef1 {
	
	
	WebDriver driver;
	
	public ShareDataStepDef1(SharedClass share) {
		driver=share.setup();
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

	
}
