package org.tag;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Tagstepdef {
	
	@Given("user is an the facebook login pageone")
	public void user_is_an_the_facebook_login_pageone() {
		System.out.println("login pageone Reg Test");
	}

	@When("user should enter the usernameone and password")
	public void user_should_enter_the_usernameone_and_password() {
		System.out.println("usernameone password Reg Test");
	}

	@When("user should click the login buttonone")
	public void user_should_click_the_login_buttonone() {
		System.out.println("click button one Reg Test");
	}

	@Given("user is an the facebook login pagetwo")
	public void user_is_an_the_facebook_login_pagetwo() {
		System.out.println("login pagetwo smokeTest");
	}

	@When("user should enter the usernametwo and password")
	public void user_should_enter_the_usernametwo_and_password() {
		System.out.println("usernametwo smoke Test");
	}

	@When("user should click the login buttontwo")
	public void user_should_click_the_login_buttontwo() {
		System.out.println("logib buttontwo smoke Test");;
	}

	@Given("user is an the facebook login pagethree")
	public void user_is_an_the_facebook_login_pagethree() {
		System.out.println("login pagethree sanity Test");
	}

	@When("user should enter the usernamethree and password")
	public void user_should_enter_the_usernamethree_and_password() {
		System.out.println("usernamethree sanity Test");
	}

	@When("user should click the login buttonthree")
	public void user_should_click_the_login_buttonthree() {
		System.out.println("login buttonthree sanity Test");
	}

	@Given("user is an the facebook login pagefour")
	public void user_is_an_the_facebook_login_pagefour() {
		System.out.println("login pagefour sanity Test");
	}

	@When("user should enter the usernamefour and password")
	public void user_should_enter_the_usernamefour_and_password() {
		System.out.println("login pagefour Reg Test");
	}

	@When("user should click the login buttonfour")
	public void user_should_click_the_login_buttonfour() {
		System.out.println("login pagefour Reg Test");
	}

	@Given("user is an the facebook login pagefive")
	public void user_is_an_the_facebook_login_pagefive() {
		System.out.println("login pagefive Reg Test");
	}

	@When("user should enter the usernamefive and password")
	public void user_should_enter_the_usernamefive_and_password() {
		System.out.println("username pagefive Reg Test");
	}

	@When("user should click the login buttonfive")
	public void user_should_click_the_login_buttonfive() {
		System.out.println("login buttonfive Reg Test");
	}

}
