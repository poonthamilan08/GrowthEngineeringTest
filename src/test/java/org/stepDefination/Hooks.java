package org.stepDefination;

import org.functionalLibraries.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before(order = 1)
	public void onetimesetup() {
		BaseClass.DriverInit("CHROME");
		System.out.println("The driver initilization has successfully completed");
	}

	@After(order = 0)
	public void EndTimeLog() {
		getCurrentData();
	}

	@Before(order = 0)
	public void startTimeLog() {
		getCurrentData();
	}

	@After(order = 1)
	public void oneTimeTearDown() {
		BaseClass.quitBrowser();
		System.out.println("The browser has closed successfully");
	}
}
