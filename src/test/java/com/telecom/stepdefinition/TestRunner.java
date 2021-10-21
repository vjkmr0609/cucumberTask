package com.telecom.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features ="src\\test\\resources\\Features\\AddTariffplan.feature",
                      glue ="com.telecom.stepdefinition",
                     plugin="html:target\\reports",
                 monochrome= true,
                     dryRun= false,
                       tags= "@1dl")
public class TestRunner {

	
}
