package step_definition;

import base.Main;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Main{

	// pre-requisite & Post-requisite annotations
	@Before
	public void loadBrowser() {
		intialization();
	}
	
	@After
	public void closeBrowser() {
		tearDown();
	}
}
