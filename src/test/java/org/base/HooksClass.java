package org.base;

import java.io.IOException;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	private void beforeScenario() {
		System.out.println("------Before scenario------");
		browserLaunch("chrome");
		urlLaunch("https://www.bigw.com.au/");
		implicitWait(20);
     }

	@After
	public void afterScenario(Scenario sc) throws IOException {
		System.out.println("------After scenario------");
		String name = sc.getName();
		if(sc.isFailed()) {
			takesscreenshot(name);
		}
		closeBrowser();
	}

	
}
