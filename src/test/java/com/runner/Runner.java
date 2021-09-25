package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"com.steps"},
		tags = {"@bootcamp"},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome= true
		)
public class Runner {
	
	@AfterClass
	public static void writeExtentReport() {
		
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10 " + "64 Bit");
	    Reporter.setSystemInfo("Smarttech", "Bootcamp");
	    Reporter.setSystemInfo("Maven", "3.6.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_231");
	    Reporter.setSystemInfo("Smart Tech", "Saturday Morning");
	}

}
