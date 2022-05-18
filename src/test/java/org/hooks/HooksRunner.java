package org.hooks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ramya\\eclipse-workspace\\Cucum\\src\\test\\resources\\Feature\\Hookfile.feature",glue="org.hooks",monochrome=true)
public class HooksRunner {

}
