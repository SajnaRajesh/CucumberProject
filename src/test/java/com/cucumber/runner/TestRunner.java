package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.baseclass.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//java///com//cucumber//feature",
		glue="com.cucumber.stepdefinition"
		)

public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void driverInitialization() throws Exception{
		driver = BaseClass.getDriver("chrome");
	}
//	@AfterClass
	//public static void driverQuit() {
	//	driver.quit();

	}

	//}
	
	


