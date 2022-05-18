package org.tag;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Tag.feature",glue="org.tag",monochrome=true,tags="@Reg or @smoke")
public class TagRunner {

}
