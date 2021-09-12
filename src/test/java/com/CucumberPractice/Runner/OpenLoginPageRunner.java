package com.CucumberPractice.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="./features",
		glue="com.CucumberPractice.StepDefination",
		plugin = { "pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true)
public class OpenLoginPageRunner extends AbstractTestNGCucumberTests{

	
}
