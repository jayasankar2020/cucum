package com.stepdefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;

public class LoginPageStep extends LibGlobal {
	WebDriver driver;

	@Given("I am verifying user facebook page")
	public void i_am_verifying_user_facebook_page() throws MalformedURLException {
		driver = getDriverCloud();
		loadUrl("https://www.facebook.com/");

	}

	@When("i am verifying user entes {string},{string}")
	public void i_am_verifying_user_entes(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@Then("user should click login button")
	public void user_should_click_login_button() {

	}

}
