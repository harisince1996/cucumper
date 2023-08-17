package org.loginstepsforgottenpassword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends LoginForgotPasswordSteps {
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

}
