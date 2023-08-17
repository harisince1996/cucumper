package org.loginSteps;

import org.mavenBaseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass1 extends BaseClass {
	@Before
	public void senario() {
		System.out.println("*** Senario Started ***");
		openchrome();
	}
	@After
	public void aftersenario() {
		close();
		System.out.println("*** Senario End ***");
	}
	@Before
	private void beforescenario2() {
		System.out.println("Before reg Scenario");
	}
	@After
	private void afterscenario2() {
		System.out.println("After reg Scenario");
	}
	@Before
	private void beforescenario1() {
		System.out.println("Before Sanity Scenario");
	}
	@After
	private void afterscenario1() {
		System.out.println("After reg Senario");

	}

}