package org.hooks;

import org.stepdef.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends BaseClass {
	@Before
	public void beforeLogin() {
		browserLaunch("https://en-gb.facebook.com");	
	}
	@After
	public void afterexecution() {
		driver.quit();
		
	}

}
