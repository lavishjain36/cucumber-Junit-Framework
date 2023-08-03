package com.demo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="D:\\JavaConcept\\CucumberProjectDemo\\src\\test\\resources\\Features",
	glue="com.demo.stepdefinitions"
)
public class TestRunner {

}
