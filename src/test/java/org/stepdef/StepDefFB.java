package org.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefFB extends BaseClass{
	
	@Given("user is an the facebook login page")
	public void user_is_an_the_facebook_login_page() {
	   browserLaunch("https://www.facebook.com/");
	    System.out.println("browser launch");
	}
	@When("user should enter the{string} and{string}")
	public void user_should_enter_the_and(String username, String password) {
	   findelemnetId("email").sendKeys(username);
	   findelemnetId("pass").sendKeys(password);
	   System.out.println("username and pasword");
	}

//	@When("user should enter the username and password")
//	public void user_should_enter_the_username_and_password() {
//	   findelemnetId("email").sendKeys("suresh");
//	   findelemnetId("pass").sendKeys("suresh@123");
//	   System.out.println("username & password");
//	   
//	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
	   name("login").click();
	   System.out.println("login button click");
	}

	@Then("user should verify the success message")
	public void user_should_verify_the_success_message() {
	   System.out.println("suscceessfully entered");
	}



}
