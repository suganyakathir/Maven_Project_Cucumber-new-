package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",dryRun=false,monochrome=true,plugin= {"pretty",
		"html:src\\test\\resources\\Reports\\HtmlReport\\report.html",
		"json:src\\test\\resources\\Reports\\JSONReport\\jsonReport.json",
		"junit:src\\test\\resources\\Reports\\JunitReport\\junitReport.xml",
		"rerun:src\\test\\resources\\Reports\\FailedScenarios\\failed.txt"})

public class TestRunner {
	@AfterClass
	public static void report() {
	 JVMReport.generateJVMReport("src\\test\\resources\\Reports\\JSONReport\\jsonReport.json");
	 System.out.println("------Report Generated-----");

	}

}
