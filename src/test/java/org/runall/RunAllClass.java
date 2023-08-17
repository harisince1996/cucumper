package org.runall;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.mavenBaseClass.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\haris\\eclipse-workspace\\cucumbarClass\\src\\test\\resources\\FeatureFile\\Login.feature",
                 glue="org.loginSteps", dryRun=false,
                 tags= {"@login"},
                 plugin={"html:Repoting\\HTML\\index.html",
                		 "json:Repoting\\Json\\fb.json",
                		 "junit:Repoting\\Junit\\fbk.xml"
                 }
)
                                
public class RunAllClass {
	
	@AfterClass
	public static void Afterallsenarios() {
		Report.generatejvmreporat("Repoting\\Json\\fb.json");
	
		
		

	}
	

}
