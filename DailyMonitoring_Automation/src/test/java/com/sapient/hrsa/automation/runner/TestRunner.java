package com.sapient.hrsa.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/features" , glue="com.sapient.hrsa.automation.stepDefinition.demographic")
public class TestRunner extends AbstractTestNGCucumberTests{

}
