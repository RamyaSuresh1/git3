package org.tsetrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Facebooklogin.feature",glue="org.stepdef",monochrome=true,plugin= {"pretty","json:src\\test\\resources\\Feature\\Reports\\output1.json"})
//snippets=SnippetType.CAMELCASE)
//strict=true
public class TestRunnerclass {
@AfterClass
public static void genjvmreport() {
	Reporting.genReport("C:\\Users\\Ramya\\eclipse-workspace\\Cucum\\src\\test\\resources\\Feature\\Reports\\output1.json");
}
}
