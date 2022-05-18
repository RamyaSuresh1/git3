package org.hooks;

import org.openqa.selenium.By;
import org.stepdef.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends BaseClass {
	@When("user should enter the username and password")
	public void user_should_enter_the_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("ram");
	    driver.findElement(By.id("pass")).sendKeys("ram@123");	    
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user should verify the success message")
	public void user_should_verify_the_success_message() {
	   System.out.println("Logged succesfully");
	}
		
}
